package com.palideclensions

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.palideclensions.databinding.ActivityBaseDeclensionActivityBinding
import com.palideclensions.grammar.*

class BaseDeclensionActivity : AppCompatActivity() {
    companion object {
        val declensionToLoad = "declensionToLoad"
    }

    private lateinit var binding: ActivityBaseDeclensionActivityBinding

    private lateinit var mappingDeclension: Map<String, Set<NounCaseNumber>>
    lateinit var declensionsToAsk: MutableSet<String>
    lateinit var declensionDisplayed: String
    lateinit var correctCaseNumbers: Set<NounCaseNumber>

    private var correct = 0
    private var errors = 0

    private var correctButtons = mutableListOf<Button>()
    private var errorButtons = mutableListOf<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        // Loader
        val loaderMappingDeclension = mapOf(
            // Purisa
            "purisa (m.)" to purisa.getGroupByDeclension(),

            // Citta
            "citta (n.)" to citta.getGroupByDeclension(),

            // Kaññā
            "kaññā (f.)" to kaññā.getGroupByDeclension(),

            // Guṇavant
            "guṇavant (m.)" to guṇavant.getGroupByDeclension(),

            //Gacchant
            "gacchant (m.)" to gacchant.getGroupByDeclension(),

            // Ratti
            "ratti (f., -i)" to ratti.getGroupByDeclension(),
            "yāgu (f., -u)" to yāgu.getGroupByDeclension(),
            "vadhū (f., -ū)" to vadhū.getGroupByDeclension(),
            "aggi (m., -i)" to aggi.getGroupByDeclension(),
            "daṇḍī (m., -ī)" to daṇḍī.getGroupByDeclension(),
            "bhikkhu (m., -u)" to bhikkhu.getGroupByDeclension(),
            "sayambhū (m., -ū)" to sayambhū.getGroupByDeclension(),

            // Nadī
            "itthī (f.)" to itthī.getGroupByDeclension(),

            // Gahapatānī
            "gahapatānī (f.)" to gahapatānī.getGroupByDeclension(),

            // Rāja
            "rāja (m.)" to rāja.getGroupByDeclension(),
            "atta (m.)" to atta.getGroupByDeclension(),

            // Satthu
            "satthu (m.)" to satthu.getGroupByDeclension(),

            // Mano
            "mano (m.)" to mano.getGroupByDeclension(),

            // Puma
            "puma (m.)" to puma.getGroupByDeclension(),

            // Sabbanāma
            "amha" to amha.getGroupByDeclension(),
            "tumha" to tumha.getGroupByDeclension(),
            "ta (m.)" to taMasculine.getGroupByDeclension(),
            "ta (n.)" to taNeuter.getGroupByDeclension(),
            "ta (f.)" to taFeminine.getGroupByDeclension(),
            "kiṁ (m.)" to kiṁMasculine.getGroupByDeclension(),
            "kiṁ (n.)" to kiṁNeuter.getGroupByDeclension(),
            "kiṁ (f.)" to kiṁFeminine.getGroupByDeclension(),
            "eta (m.)" to etaMasculine.getGroupByDeclension(),
            "eta (n.)" to etaNeuter.getGroupByDeclension(),
            "eta (f.)" to etaFeminine.getGroupByDeclension(),
        )

        val declensionToLoad = intent?.extras?.getString(declensionToLoad)
        mappingDeclension = loaderMappingDeclension[declensionToLoad]!!

        // Init
        super.onCreate(savedInstanceState)
        binding = ActivityBaseDeclensionActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnMap: Map<Button, NounCaseNumber> = mapOf(
            binding.btnNomSin to nomSin,
            binding.btnNomPl to nomPl,
            binding.btnVocSin to vocSin,
            binding.btnVocPl to vocPl,
            binding.btnAccSin to accSin,
            binding.btnAccPl to accPl,
            binding.btnInsSin to insSin,
            binding.btnInsPl to insPl,
            binding.btnDatSin to datSin,
            binding.btnDatPl to datPl,
            binding.btnAblSin to ablSin,
            binding.btnAblPl to ablPl,
            binding.btnGenSin to genSin,
            binding.btnGenPl to genPl,
            binding.btnLocSin to locSin,
            binding.btnLocPl to locPl,
        )

        for (entry in btnMap.entries.iterator()) {
            entry.key.setOnClickListener { assessUserInput(entry.key, entry.value) }
        }

        declensionsToAsk = mappingDeclension.keys.toMutableSet()

        prepareRound()
    }

    fun prepareRound() {
        // Finish activity upon emptied set
        if (declensionsToAsk.size == 0) {
            finish()
            return
        }

        // Reset normal button's text color
        if (errorButtons.size > 0) {
            for (btn in errorButtons) {
                btn.setTextColor(ContextCompat.getColor(this, R.color.white))
            }
            errorButtons = mutableListOf()
        }

        if (correctButtons.size > 0) {
            for (btn in correctButtons) {
                btn.setTextColor(ContextCompat.getColor(this, R.color.white))
            }
            correctButtons = mutableListOf()
        }

        // Get next declension
        declensionDisplayed = declensionsToAsk.random()
        correctCaseNumbers = mappingDeclension[declensionDisplayed]!!

        displayUI()
    }

    fun displayUI() {
        binding.tvDisplayChar.text = declensionDisplayed
//        binding.tvRemaining.text = getString(R.string.remaining, declensionsToAsk.size.toString())
//        binding.tvErrors.text = getString(R.string.errors, errors)
    }

    fun assessUserInput(btn: Button, clickedCaseNumber: NounCaseNumber) {
        if (clickedCaseNumber in correctCaseNumbers) {
            btn.setTextColor(ContextCompat.getColor(this, R.color.darkGreen2))
            correctButtons.add(btn)
            correct++
        } else {
            btn.setTextColor(ContextCompat.getColor(this, R.color.darkRed1))
            errorButtons.add(btn)
            errors++
//            tvErrors.text = getString(R.string.errors, errors)
        }

        // Round is finished, all correct cases are clicked
        if (correctButtons.size == correctCaseNumbers.size) {
            declensionsToAsk.remove(declensionDisplayed)
            prepareRound()
        }
    }
}