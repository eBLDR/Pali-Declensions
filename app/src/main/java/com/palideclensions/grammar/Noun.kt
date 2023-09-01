package com.palideclensions.grammar

class Noun(
    val stem: String,
    val gender: Gender,
    val ending: NounEnding,
    val group: Group,
    val declensionMap: Map<NounCaseNumber, Set<String>>,
) {
    fun getGroupByDeclension(): Map<String, Set<NounCaseNumber>> {
        val groupByDeclension = mutableMapOf<String, MutableSet<NounCaseNumber>>()
        for (entry in declensionMap.entries.iterator()) {
            for (declension in entry.value) {
                if (declension !in groupByDeclension.keys) {
                    groupByDeclension[declension] = mutableSetOf()
                }
                groupByDeclension[declension]?.add(entry.key)
            }
        }
        return groupByDeclension
    }
}

val purisaData = mapOf(
    nomSin to setOf("puriso"),
    nomPl to setOf("purisā"),
    vocSin to setOf("purisa", "purisā"),
    vocPl to setOf("purisā"),
    accSin to setOf("purisaṁ"),
    accPl to setOf("purise"),
    insSin to setOf("purisena"),
    insPl to setOf("purisehi", "purisebhi"),
    datSin to setOf("purisassa"),
    datPl to setOf("purisānaṁ"),
    ablSin to setOf("purisā", "purisasmā", "purisamhā"),
    ablPl to setOf("purisehi", "purisebhi"),
    genSin to setOf("purisassa"),
    genPl to setOf("purisānaṁ"),
    locSin to setOf("purise", "purisasmiṁ", "purisamhi"),
    locPl to setOf("purisesu"),
)

val purisa = Noun("purisa", genderMasculine, endingA, groupPurisa, purisaData)

val cittaData = mapOf(
    nomSin to setOf("cittaṁ"),
    nomPl to setOf("cittā", "cittāni"),
    vocSin to setOf("citta", "cittā"),
    vocPl to setOf("cittā", "cittāni"),
    accSin to setOf("cittaṁ"),
    accPl to setOf("citte"),
    insSin to setOf("cittena"),
    insPl to setOf("cittehi", "cittebhi"),
    datSin to setOf("cittassa"),
    datPl to setOf("cittānaṁ"),
    ablSin to setOf("cittā", "cittasmā", "cittamhā"),
    ablPl to setOf("cittehi", "cittebhi"),
    genSin to setOf("cittassa"),
    genPl to setOf("cittānaṁ"),
    locSin to setOf("citte", "cittasmiṁ", "cittamhi"),
    locPl to setOf("cittesu"),
)

val citta = Noun("citta", genderNeuter, endingA, groupCitta, cittaData)

val kaññāData = mapOf(
    nomSin to setOf("kaññā"),
    nomPl to setOf("kaññā", "kaññāyo"),
    vocSin to setOf("kaññe"),
    vocPl to setOf("kaññā", "kaññāyo"),
    accSin to setOf("kaññaṁ"),
    accPl to setOf("kaññā", "kaññāyo"),
    insSin to setOf("kaññāya"),
    insPl to setOf("kaññāhi", "kaññābhi"),
    datSin to setOf("kaññāya"),
    datPl to setOf("kaññānaṁ"),
    ablSin to setOf("kaññāya"),
    ablPl to setOf("kaññāhi", "kaññābhi"),
    genSin to setOf("kaññāya"),
    genPl to setOf("kaññānaṁ"),
    locSin to setOf("kaññāya", "kaññāyaṁ"),
    locPl to setOf("kaññāsu"),
)

val kaññā = Noun("kaññā", genderFeminine, endingĀ, groupKaññā, kaññāData)

val guṇavantData = mapOf(
    nomSin to setOf("guṇavā", "guṇavanto"),
    nomPl to setOf("guṇavantā", "guṇavanto"),
    vocSin to setOf("guṇavaṁ", "guṇava", "guṇavā"),
    vocPl to setOf("guṇavantā", "guṇavanto"),
    accSin to setOf("guṇavaṁ", "guṇavantaṁ"),
    accPl to setOf("guṇavante"),
    insSin to setOf("guṇavatā", "guṇavantena"),
    insPl to setOf("guṇavantehi", "guṇavantebhi"),
    datSin to setOf("guṇavassa", "guṇavato", "guṇavantassa"),
    datPl to setOf("guṇavantaṁ", "guṇavantānaṁ"),
    ablSin to setOf("guṇavatā", "guṇavantā", "guṇavantasmā", "guṇavantamhā"),
    ablPl to setOf("guṇavantehi", "guṇavantebhi"),
    genSin to setOf("guṇavassa", "guṇavato", "guṇavantassa"),
    genPl to setOf("guṇavantaṁ", "guṇavantānaṁ"),
    locSin to setOf("guṇavati", "guṇavante", "guṇavantasmiṁ", "guṇavantamhi"),
    locPl to setOf("guṇavantesu"),
)

val guṇavant =
    Noun("guṇavant", genderMasculine, endingNT, groupGuṇavantu, guṇavantData)

val gacchantData = mapOf(
    nomSin to setOf("gacchaṁ", "gacchanto"),
    nomPl to setOf("gacchantā", "gacchanto"),
    vocSin to setOf("gacchaṁ", "gaccha", "gacchā"),
    vocPl to setOf("gacchantā", "gacchanto"),
    accSin to setOf("gacchaṁ", "gacchantaṁ"),
    accPl to setOf("gacchante"),
    insSin to setOf("gacchatā", "gacchantena"),
    insPl to setOf("gacchantehi", "gacchantebhi"),
    datSin to setOf("gacchassa", "gacchato", "gacchantassa"),
    datPl to setOf("gacchantaṁ", "gacchantānaṁ"),
    ablSin to setOf("gacchatā", "gacchantā", "gacchantasmā", "gacchantamhā"),
    ablPl to setOf("gacchantehi", "gacchantebhi"),
    genSin to setOf("gacchassa", "gacchato", "gacchantassa"),
    genPl to setOf("gacchantaṁ", "gacchantānaṁ"),
    locSin to setOf("gacchati", "gacchante", "gacchantasmiṁ", "gacchantamhi"),
    locPl to setOf("gacchantesu"),
)

val gacchant =
    Noun("gacchant", genderMasculine, endingNT, groupGacchanta, gacchantData)

val rattiData = mapOf(
    nomSin to setOf("ratti"),
    nomPl to setOf("rattī", "rattiyo"),
    vocSin to setOf("ratti"),
    vocPl to setOf("rattī", "rattiyo"),
    accSin to setOf("rattiṁ"),
    accPl to setOf("rattī", "rattiyo"),
    insSin to setOf("rattiyā"),
    insPl to setOf("rattihi", "rattibhi", "rattīhi", "rattībhi"),
    datSin to setOf("rattiyā"),
    datPl to setOf("rattīnaṁ", "rattinaṁ"),
    ablSin to setOf("rattiyā"),
    ablPl to setOf("rattihi", "rattibhi", "rattīhi", "rattībhi"),
    genSin to setOf("rattiyā"),
    genPl to setOf("rattīnaṁ", "rattinaṁ"),
    locSin to setOf("rattiyā", "rattiyāṁ"),
    locPl to setOf("rattīsu", "rattisu"),
)

val ratti = Noun("ratti", genderFeminine, endingI, groupRatti, rattiData)

val yāguData = mapOf(
    nomSin to setOf("yāgu"),
    nomPl to setOf("yāgū", "yāguyo"),
    vocSin to setOf("yāgu"),
    vocPl to setOf("yāgū", "yāguyo"),
    accSin to setOf("yāguṁ"),
    accPl to setOf("yāgū", "yāguyo"),
    insSin to setOf("yāguyā"),
    insPl to setOf("yāguhi", "yāgubhi", "yāgūhi", "yāgūbhi"),
    datSin to setOf("yāguyā"),
    datPl to setOf("yāgūnaṁ", "yāgunaṁ"),
    ablSin to setOf("yāguyā"),
    ablPl to setOf("yāguhi", "yāgubhi", "yāgūhi", "yāgūbhi"),
    genSin to setOf("yāguyā"),
    genPl to setOf("yāgūnaṁ", "yāgunaṁ"),
    locSin to setOf("yāguyā", "yāguyāṁ"),
    locPl to setOf("yāgūsu", "yāgusu"),
)

val yāgu = Noun("yāgu", genderFeminine, endingU, groupRatti, yāguData)

val vadhūData = mapOf(
    nomSin to setOf("vadhū"),
    nomPl to setOf("vadhū", "vadhuyo"),
    vocSin to setOf("vadhu"),
    vocPl to setOf("vadhū", "vadhuyo"),
    accSin to setOf("vadhuṁ"),
    accPl to setOf("vadhū", "vadhuyo"),
    insSin to setOf("vadhuyā"),
    insPl to setOf("vadhūhi", "vadhūbhi"),
    datSin to setOf("vadhuyā"),
    datPl to setOf("vadhūnaṁ"),
    ablSin to setOf("vadhuyā"),
    ablPl to setOf("vadhūhi", "vadhūbhi"),
    genSin to setOf("vadhuyā"),
    genPl to setOf("vadhūnaṁ"),
    locSin to setOf("vadhuyā", "vadhuyāṁ"),
    locPl to setOf("vadhūsu"),
)

val vadhū = Noun("vadhū", genderFeminine, endingŪ, groupRatti, vadhūData)

val aggiData = mapOf(
    nomSin to setOf("aggi"),
    nomPl to setOf("aggī", "aggayo"),
    vocSin to setOf("aggi"),
    vocPl to setOf("aggī", "aggayo"),
    accSin to setOf("aggiṁ"),
    accPl to setOf("aggī", "aggayo"),
    insSin to setOf("agginā"),
    insPl to setOf("aggihi", "aggibhi", "aggīhi", "aggībhi"),
    datSin to setOf("aggissa", "aggino"),
    datPl to setOf("aggīnaṁ", "agginaṁ"),
    ablSin to setOf("agginā", "aggimhā", "aggismā"),
    ablPl to setOf("aggihi", "aggibhi", "aggīhi", "aggībhi"),
    genSin to setOf("aggissa", "aggino"),
    genPl to setOf("aggīnaṁ", "agginaṁ"),
    locSin to setOf("aggismiṁ", "aggimhi"),
    locPl to setOf("aggīsu", "aggisu"),
)

val aggi = Noun("aggi", genderMasculine, endingI, groupRatti, aggiData)

val daṇḍīData = mapOf(
    nomSin to setOf("daṇḍī"),
    nomPl to setOf("daṇḍī", "daṇḍino"),
    vocSin to setOf("daṇḍi"),
    vocPl to setOf("daṇḍī", "daṇḍino"),
    accSin to setOf("daṇḍiṁ", "daṇḍinaṁ"),
    accPl to setOf("daṇḍī", "daṇḍino"),
    insSin to setOf("daṇḍinā"),
    insPl to setOf("daṇḍīhi", "daṇḍībhi"),
    datSin to setOf("daṇḍissa", "daṇḍino"),
    datPl to setOf("daṇḍīnaṁ"),
    ablSin to setOf("daṇḍinā"),
    ablPl to setOf("daṇḍīhi", "daṇḍībhi"),
    genSin to setOf("daṇḍissa", "daṇḍino"),
    genPl to setOf("daṇḍīnaṁ"),
    locSin to setOf("daṇḍismiṁ", "daṇḍimhi", "daṇḍini"),
    locPl to setOf("daṇḍīsu"),
)

val daṇḍī = Noun("daṇḍī", genderMasculine, endingĪ, groupRatti, daṇḍīData)

val bhikkhuData = mapOf(
    nomSin to setOf("bhikkhu"),
    nomPl to setOf("bhikkhū", "bhikkhavo"),
    vocSin to setOf("bhikkhu"),
    vocPl to setOf("bhikkhū", "bhikkhavo", "bhikkhave"),
    accSin to setOf("bhikkhuṁ"),
    accPl to setOf("bhikkhū", "bhikkhavo"),
    insSin to setOf("bhikkhunā"),
    insPl to setOf("bhikkhuhi", "bhikkhubhi", "bhikkhūhi", "bhikkhūbhi"),
    datSin to setOf("bhikkhussa", "bhikkhuno"),
    datPl to setOf("bhikkhūnaṁ", "bhikkhunaṁ"),
    ablSin to setOf("bhikkhunā", "bhikkhumhā", "bhikkhusmā"),
    ablPl to setOf("bhikkhuhi", "bhikkhubhi", "bhikkhūhi", "bhikkhūbhi"),
    genSin to setOf("bhikkhussa", "bhikkhuno"),
    genPl to setOf("bhikkhūnaṁ", "bhikkhunaṁ"),
    locSin to setOf("bhikkhusmiṁ", "bhikkhumhi"),
    locPl to setOf("bhikkhūsu", "bhikkhusu"),
)

val bhikkhu = Noun("bhikkhu", genderMasculine, endingU, groupRatti, bhikkhuData)

val sayambhūData = mapOf(
    nomSin to setOf("sayambhū"),
    nomPl to setOf("sayambhū", "sayambhuvo"),
    vocSin to setOf("sayambhu"),
    vocPl to setOf("sayambhū", "sayambhuvo"),
    accSin to setOf("sayambhuṁ"),
    accPl to setOf("sayambhū", "sayambhuvo"),
    insSin to setOf("sayambhunā"),
    insPl to setOf("sayambhūhi", "sayambhūbhi"),
    datSin to setOf("sayambhussa", "sayambhuno"),
    datPl to setOf("sayambhūnaṁ"),
    ablSin to setOf("sayambhunā"),
    ablPl to setOf("sayambhūhi", "sayambhūbhi"),
    genSin to setOf("sayambhussa", "sayambhuno"),
    genPl to setOf("sayambhūnaṁ"),
    locSin to setOf("sayambhusmiṁ", "sayambhumhi"),
    locPl to setOf("sayambhūsu"),
)

val sayambhū =
    Noun("sayambhū", genderMasculine, endingŪ, groupRatti, sayambhūData)

val itthīData = mapOf(
    nomSin to setOf("itthī"),
    nomPl to setOf("itthī", "itthiyo"),
    vocSin to setOf("itthi"),
    vocPl to setOf("itthī", "itthiyo"),
    accSin to setOf("itthiṁ", "itthiyaṁ"),
    accPl to setOf("itthī", "itthiyo"),
    insSin to setOf("itthiyā"),
    insPl to setOf("itthīhi", "itthībhi"),
    datSin to setOf("itthiyā"),
    datPl to setOf("itthīnaṁ"),
    ablSin to setOf("itthiyā"),
    ablPl to setOf("itthīhi", "itthībhi"),
    genSin to setOf("itthiyā"),
    genPl to setOf("itthīnaṁ"),
    locSin to setOf("itthiyā", "itthiyāṁ"),
    locPl to setOf("itthīsu"),
)

val itthī = Noun("itthī", genderFeminine, endingĪ, groupNadī, itthīData)

val gahapatānīData = mapOf(
    nomSin to setOf("gahapatānī"),
    nomPl to setOf("gahapatānī", "gahapatāniyo"),
    vocSin to setOf("gahapatāni"),
    vocPl to setOf("gahapatānī", "gahapatāniyo"),
    accSin to setOf("gahapatāniṁ", "gahapatāniyaṁ"),
    accPl to setOf("gahapatānī", "gahapatāniyo"),
    insSin to setOf("gahapatāniyā"),
    insPl to setOf("gahapatānīhi", "gahapatānībhi"),
    datSin to setOf("gahapatāniyā"),
    datPl to setOf("gahapatānīnaṁ"),
    ablSin to setOf("gahapatāniyā"),
    ablPl to setOf("gahapatānīhi", "gahapatānībhi"),
    genSin to setOf("gahapatāniyā"),
    genPl to setOf("gahapatānīnaṁ"),
    locSin to setOf("gahapatāniyā", "gahapatāniyāṁ"),
    locPl to setOf("gahapatānīsu"),
)

val gahapatānī = Noun("gahapatānī", genderFeminine, endingĪ, groupGahapatānī, gahapatānīData)

val rājaData = mapOf(
    nomSin to setOf("rājā"),
    nomPl to setOf("rājāno"),
    vocSin to setOf("rāja", "rājā"),
    vocPl to setOf("rājāno"),
    accSin to setOf("rājaṁ", "rājānaṁ"),
    accPl to setOf("rājāno"),
    insSin to setOf("raññā", "rājinā", "rājena"),
    insPl to setOf("rājehi", "rājebhi", "rājūhi", "rājūbhi"),
    datSin to setOf("rañño", "rājino"),
    datPl to setOf("rājānaṁ", "rājūnaṁ", "raññaṁ"),
    ablSin to setOf("raññā"),
    ablPl to setOf("rājehi", "rājebhi", "rājūhi", "rājūbhi"),
    genSin to setOf("rañño", "rājino"),
    genPl to setOf("rājānaṁ", "rājūnaṁ", "raññaṁ"),
    locSin to setOf("raññe", "rājini"),
    locPl to setOf("rājūsu", "rājesu"),
)

val rāja = Noun("rāja", genderMasculine, endingA, groupRāja, rājaData)

val attaData = mapOf(
    nomSin to setOf("attā"),
    nomPl to setOf("attāno"),
    vocSin to setOf("atta", "attā"),
    vocPl to setOf("attāno"),
    accSin to setOf("attaṁ", "attānaṁ"),
    accPl to setOf("attāno"),
    insSin to setOf("attanā", "attena"),
    insPl to setOf("attanehi", "attanebhi"),
    datSin to setOf("attano", "attassa"),
    datPl to setOf("attānaṁ"),
    ablSin to setOf("attanā"),
    ablPl to setOf("attanehi", "attanebhi"),
    genSin to setOf("attano", "attassa"),
    genPl to setOf("attānaṁ"),
    locSin to setOf("attani"),
    locPl to setOf("attanesu", "attesu"),
)

val atta = Noun("atta", genderMasculine, endingA, groupRāja, attaData)

val satthuData = mapOf(
    nomSin to setOf("satthā"),
    nomPl to setOf("satthāro"),
    vocSin to setOf("sattha", "satthā"),
    vocPl to setOf("satthāro"),
    accSin to setOf("satthāraṁ"),
    accPl to setOf("satthāro"),
    insSin to setOf("satthārā", "satthunā"),
    insPl to setOf("satthārehi", "satthārebhi", "satthūhi", "satthūbhi"),
    datSin to setOf("satthu", "satthuno", "satthussa"),
    datPl to setOf("satthārānaṁ", "satthānaṁ", "satthūnaṁ"),
    ablSin to setOf("satthārā"),
    ablPl to setOf("satthārehi", "satthārebhi", "satthūhi", "satthūbhi"),
    genSin to setOf("satthu", "satthuno", "satthussa"),
    genPl to setOf("satthārānaṁ", "satthānaṁ", "satthūnaṁ"),
    locSin to setOf("satthari"),
    locPl to setOf("satthāresu", "satthūsu"),
)

val satthu = Noun("satthu", genderMasculine, endingU, groupSatthu, satthuData)

val manoData = mapOf(
    nomSin to setOf("mano", "manaṁ"),
    nomPl to setOf("manā", "manāni"),
    vocSin to setOf("mana", "manā"),
    vocPl to setOf("manā", "manāni"),
    accSin to setOf("manaṁ", "mano"),
    accPl to setOf("mane", "manāni"),
    insSin to setOf("manena", "manassā"),
    insPl to setOf("manehi", "manebhi"),
    datSin to setOf("manassa", "manaso"),
    datPl to setOf("manānaṁ"),
    ablSin to setOf("manā", "manasmā", "manamhā"),
    ablPl to setOf("manehi", "manebhi"),
    genSin to setOf("manassa", "manaso"),
    genPl to setOf("manānaṁ"),
    locSin to setOf("mane", "manasi", "manasmiṁ", "manamhi"),
    locPl to setOf("manesu"),
)

val mano = Noun("mano", genderMasculine, endingA, groupMano, manoData)

val pumaData = mapOf(
    nomSin to setOf("pumo", "pumā"),
    nomPl to setOf("pumā", "pumāno"),
    vocSin to setOf("puma", "pumā", "pumaṁ"),
    vocPl to setOf("pumā", "pumāno"),
    accSin to setOf("pumaṁ", "pumānaṁ"),
    accPl to setOf("pume", "pumāno"),
    insSin to setOf("pumena", "pumunā", "pumānā"),
    insPl to setOf("pumehi", "pumebhi", "pumānehi", "pumānebhi"),
    datSin to setOf("pumuno", "pumassa"),
    datPl to setOf("pumānaṁ"),
    ablSin to setOf("pumā", "pumasmā", "pumamhā", "pumunā"),
    ablPl to setOf("pumehi", "pumebhi", "pumānehi", "pumānebhi"),
    genSin to setOf("pumuno", "pumassa"),
    genPl to setOf("pumānaṁ"),
    locSin to setOf("pume", "pumasmiṁ", "pumamhi", "pumāne"),
    locPl to setOf("pumesu"),
)

val puma = Noun("puma", genderMasculine, endingA, groupPuma, pumaData)

val amhaData = mapOf(
    nomSin to setOf("ahaṁ"),
    nomPl to setOf("mayaṁ", "amhe"),
    accSin to setOf("maṁ", "mamaṁ"),
    accPl to setOf("amhe", "amhākaṁ", "no"),
    insSin to setOf("mayā", "me"),
    insPl to setOf("amhehi", "amhebhi", "no"),
    datSin to setOf("mama", "mayhaṁ", "mamaṁ", "me"),
    datPl to setOf("amhākaṁ", "amhaṁ", "no"),
    ablSin to setOf("mayā"),
    ablPl to setOf("amhehi", "amhebhi"),
    genSin to setOf("mama", "mayhaṁ", "mamaṁ", "me"),
    genPl to setOf("amhākaṁ", "amhaṁ", "no"),
    locSin to setOf("mayi"),
    locPl to setOf("amhesu"),
)

val amha = Noun("amha", genderThree, endingA, groupSabbanāma, amhaData)

val tumhaData = mapOf(
    nomSin to setOf("tvaṁ"),
    nomPl to setOf("tumhe"),
    accSin to setOf("taṁ", "tavaṁ"),
    accPl to setOf("tumhe", "tumhākaṁ", "vo"),
    insSin to setOf("tayā", "te"),
    insPl to setOf("tumhehi", "tumhebhi", "vo"),
    datSin to setOf("tava", "tuyhaṁ", "tavaṁ", "te"),
    datPl to setOf("tumhākaṁ", "tumhaṁ", "vo"),
    ablSin to setOf("tayā"),
    ablPl to setOf("tumhehi", "tumhebhi"),
    genSin to setOf("tava", "tuyhaṁ", "tavaṁ", "te"),
    genPl to setOf("tumhākaṁ", "tumhaṁ", "no"),
    locSin to setOf("tayi"),
    locPl to setOf("tumhesu"),
)

val tumha = Noun("tumha", genderThree, endingA, groupSabbanāma, tumhaData)

val taMasculineData = mapOf(
    nomSin to setOf("so"),
    nomPl to setOf("ne", "te"),
    accSin to setOf("naṁ", "taṁ"),
    accPl to setOf("ne", "te"),
    insSin to setOf("nena", "tena"),
    insPl to setOf("nehi", "nebhi", "tehi", "tebhi"),
    datSin to setOf("nassa", "assa", "tassa"),
    datPl to setOf("nesaṁ", "nesānaṁ", "tesaṁ", "tesānaṁ"),
    ablSin to setOf("nasmā", "asmā", "tasmā", "namhā", "tamhā"),
    ablPl to setOf("nehi", "nebhi", "tehi", "tebhi"),
    genSin to setOf("nassa", "assa", "tassa"),
    genPl to setOf("nesaṁ", "nesānaṁ", "tesaṁ", "tesānaṁ"),
    locSin to setOf("namhi", "tamhi", "nasmiṁ", "asmiṁ", "tasmiṁ"),
    locPl to setOf("nesu", "tesu"),
)

val taMasculine = Noun("ta", genderMasculine, endingA, groupSabbanāma, taMasculineData)

val taNeuterData = mapOf(
    nomSin to setOf("naṁ", "taṁ"),
    nomPl to setOf("nāni", "tāni"),
    accSin to setOf("naṁ", "taṁ"),
    accPl to setOf("nāni", "tāni"),
    insSin to setOf("nena", "tena"),
    insPl to setOf("nehi", "nebhi", "tehi", "tebhi"),
    datSin to setOf("nassa", "assa", "tassa"),
    datPl to setOf("nesaṁ", "nesānaṁ", "tesaṁ", "tesānaṁ"),
    ablSin to setOf("nasmā", "asmā", "tasmā", "namhā", "tamhā"),
    ablPl to setOf("nehi", "nebhi", "tehi", "tebhi"),
    genSin to setOf("nassa", "assa", "tassa"),
    genPl to setOf("nesaṁ", "nesānaṁ", "tesaṁ", "tesānaṁ"),
    locSin to setOf("namhi", "tamhi", "nasmiṁ", "asmiṁ", "tasmiṁ"),
    locPl to setOf("nesu", "tesu"),
)

val taNeuter = Noun("ta", genderNeuter, endingA, groupSabbanāma, taNeuterData)

val taFeminineData = mapOf(
    nomSin to setOf("sā"),
    nomPl to setOf("nā", "nāyo", "tā", "tāyo"),
    accSin to setOf("naṁ", "taṁ"),
    accPl to setOf("nā", "nāyo", "tā", "tāyo"),
    insSin to setOf("nāya", "tāya"),
    insPl to setOf("nāhi", "nābhi", "tāhi", "tābhi"),
    datSin to setOf("tissā", "tassā", "nassā", "assā", "tissāya", "tassāya", "nassāya", "assāya", "nāya", "tāya"),
    datPl to setOf("nāsaṁ", "nāsānaṁ", "tāsaṁ", "tāsānaṁ"),
    ablSin to setOf("nāya", "tāya"),
    ablPl to setOf("nāhi", "nābhi", "tāhi", "tābhi"),
    genSin to setOf("tissā", "tassā", "nassā", "assā", "tissāya", "tassāya", "nassāya", "assāya", "nāya", "tāya"),
    genPl to setOf("nāsaṁ", "nāsānaṁ", "tāsaṁ", "tāsānaṁ"),
    locSin to setOf("tissaṁ", "tassaṁ", "nassaṁ", "assaṁ", "nāyaṁ", "tāyaṁ"),
    locPl to setOf("nāsu", "tāsu"),
)

val taFeminine = Noun("ta", genderFeminine, endingA, groupSabbanāma, taFeminineData)

val kiṁMasculineData = mapOf(
    nomSin to setOf("ko"),
    nomPl to setOf("ke"),
    accSin to setOf("kaṁ"),
    accPl to setOf("ke"),
    insSin to setOf("kena"),
    insPl to setOf("kehi", "kebhi"),
    datSin to setOf("kassa", "kissa"),
    datPl to setOf("kesaṁ", "kesānaṁ"),
    ablSin to setOf("kasmā", "kamhā"),
    ablPl to setOf("kehi", "kebhi"),
    genSin to setOf("kassa", "kissa"),
    genPl to setOf("kesaṁ", "kesānaṁ"),
    locSin to setOf("kasmiṁ", "kismiṁ", "kamhi", "kimhi"),
    locPl to setOf("kesu"),
)

val kiṁMasculine = Noun("ka", genderMasculine, endingA, groupSabbanāma, kiṁMasculineData)

val kiṁNeuterData = mapOf(
    nomSin to setOf("kim"),
    nomPl to setOf("kāni"),
    accSin to setOf("kiṁ"),
    accPl to setOf("kāni"),
    insSin to setOf("kena"),
    insPl to setOf("kehi", "kebhi"),
    datSin to setOf("kassa", "kissa"),
    datPl to setOf("kesaṁ", "kesānaṁ"),
    ablSin to setOf("kasmā", "kamhā"),
    ablPl to setOf("kehi", "kebhi"),
    genSin to setOf("kassa", "kissa"),
    genPl to setOf("kesaṁ", "kesānaṁ"),
    locSin to setOf("kasmiṁ", "kismiṁ", "kamhi", "kimhi"),
    locPl to setOf("kesu"),
)

val kiṁNeuter = Noun("ka", genderNeuter, endingA, groupSabbanāma, kiṁNeuterData)

val kiṁFeminineData = mapOf(
    nomSin to setOf("kā"),
    nomPl to setOf("kā", "kāyo"),
    accSin to setOf("kaṁ"),
    accPl to setOf("kā", "kāyo"),
    insSin to setOf("kāya"),
    insPl to setOf("kāhi", "kābhi"),
    datSin to setOf("kāya", "kāssa"),
    datPl to setOf("kāsaṁ", "kāsānaṁ"),
    ablSin to setOf("kāya"),
    ablPl to setOf("kāhi", "kābhi"),
    genSin to setOf("kāya", "kāssa"),
    genPl to setOf("kāsaṁ", "kāsānaṁ"),
    locSin to setOf("kāyaṁ", "kassaṁ"),
    locPl to setOf("kāsu"),
)

val kiṁFeminine = Noun("ka", genderFeminine, endingA, groupSabbanāma, kiṁFeminineData)

val etaMasculineData = mapOf(
    nomSin to setOf("eso"),
    nomPl to setOf("ete"),
    accSin to setOf("etaṁ"),
    accPl to setOf("ete"),
    insSin to setOf("etena"),
    insPl to setOf("etehi", "etebhi"),
    datSin to setOf("etassa"),
    datPl to setOf("etesaṁ", "etesānaṁ"),
    ablSin to setOf("etasmā", "etamhā"),
    ablPl to setOf("etehi", "etebhi"),
    genSin to setOf("etassa"),
    genPl to setOf("etesaṁ", "etesānaṁ"),
    locSin to setOf("etasmiṁ", "etamhi"),
    locPl to setOf("etesu"),
)

val etaMasculine = Noun("eta", genderMasculine, endingA, groupSabbanāma, etaMasculineData)

val etaNeuterData = mapOf(
    nomSin to setOf("etaṁ"),
    nomPl to setOf("etāni"),
    accSin to setOf("etaṁ"),
    accPl to setOf("etāni"),
    insSin to setOf("etena"),
    insPl to setOf("etehi", "etebhi"),
    datSin to setOf("etassa"),
    datPl to setOf("etesaṁ", "etesānaṁ"),
    ablSin to setOf("etasmā", "etamhā"),
    ablPl to setOf("etehi", "etebhi"),
    genSin to setOf("etassa"),
    genPl to setOf("etesaṁ", "etesānaṁ"),
    locSin to setOf("etasmiṁ", "etamhi"),
    locPl to setOf("etesu"),
)

val etaNeuter = Noun("eta", genderNeuter, endingA, groupSabbanāma, etaNeuterData)

val etaFeminineData = mapOf(
    nomSin to setOf("esā"),
    nomPl to setOf("etā", "etāyo"),
    accSin to setOf("etaṁ"),
    accPl to setOf("etā", "etāyo"),
    insSin to setOf("etāya"),
    insPl to setOf("etāhi", "etābhi"),
    datSin to setOf("etāya", "etissā", "etissāya"),
    datPl to setOf("etāsaṁ", "etāsānaṁ"),
    ablSin to setOf("etāya"),
    ablPl to setOf("etāhi", "etābhi"),
    genSin to setOf("etāya", "etissā", "etissāya"),
    genPl to setOf("etāsaṁ", "etāsānaṁ"),
    locSin to setOf("etāyaṁ", "etissaṁ"),
    locPl to setOf("etāsu"),
)

val etaFeminine = Noun("eta", genderFeminine, endingA, groupSabbanāma, etaFeminineData)