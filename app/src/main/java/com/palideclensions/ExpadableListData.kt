package com.palideclensions

import java.util.*

internal object ExpandableListData {
    val data: MutableMap<String, List<String>>
        get() {
            val expandableListDetail = mutableMapOf<String, List<String>>()

            val purisaGroup: MutableList<String> = ArrayList()
            purisaGroup.add("purisa (m.)")
            expandableListDetail["Purisa group"] = purisaGroup

            val cittaGroup: MutableList<String> = ArrayList()
            cittaGroup.add("citta (n.)")
            expandableListDetail["Citta group"] = cittaGroup

            val kaññāGroup: MutableList<String> = ArrayList()
            kaññāGroup.add("kaññā (f.)")
            expandableListDetail["Kaññā group"] = kaññāGroup

            val guṇavantGroup: MutableList<String> = ArrayList()
            guṇavantGroup.add("guṇavant (m.)")  // masculine
            expandableListDetail["Guṇavant group"] = guṇavantGroup

            val gacchantGroup: MutableList<String> = ArrayList()
            gacchantGroup.add("gacchant (m.)")  // masculine
            expandableListDetail["Gacchant group"] = gacchantGroup

            val rattiGroup: MutableList<String> = ArrayList()
            rattiGroup.add("ratti (f., -i)")
            rattiGroup.add("yāgu (f., -u)")
            rattiGroup.add("vadhū (f., -ū)")
            rattiGroup.add("aggi (m., -i)")
            rattiGroup.add("daṇḍī (m., -ī)")
            rattiGroup.add("bhikkhu (m., -u)")
            rattiGroup.add("sayambhū (m., -ū)")
            expandableListDetail["Ratti group"] = rattiGroup

            val nadīGroup: MutableList<String> = ArrayList()
            nadīGroup.add("itthī (f.)")
            expandableListDetail["Nadī group"] = nadīGroup

            val gahapatānīGroup: MutableList<String> = ArrayList()
            gahapatānīGroup.add("gahapatānī (f.)")
            expandableListDetail["Gahapatānī group"] = gahapatānīGroup

            val rājaGroup: MutableList<String> = ArrayList()
            rājaGroup.add("rāja (m.)")
            rājaGroup.add("atta (m.)")
            expandableListDetail["Rāja group"] = rājaGroup

            val satthuGroup: MutableList<String> = ArrayList()
            satthuGroup.add("satthu (m.)")
            expandableListDetail["Satthu group"] = satthuGroup

            val manoGroup: MutableList<String> = ArrayList()
            manoGroup.add("mano (m.)")
            expandableListDetail["Mano group"] = manoGroup

            val pumaGroup: MutableList<String> = ArrayList()
            pumaGroup.add("puma (m.)")
            expandableListDetail["Puma group"] = pumaGroup

            val sabbanāmaGroup: MutableList<String> = ArrayList()
            sabbanāmaGroup.add("amha")
            sabbanāmaGroup.add("tumha")
            sabbanāmaGroup.add("ta (m.)")
            sabbanāmaGroup.add("ta (n.)")
            sabbanāmaGroup.add("ta (f.)")
            sabbanāmaGroup.add("kiṁ (m.)")
            sabbanāmaGroup.add("kiṁ (n.)")
            sabbanāmaGroup.add("kiṁ (f.)")
            sabbanāmaGroup.add("eta (m.)")
            sabbanāmaGroup.add("eta (n.)")
            sabbanāmaGroup.add("eta (f.)")
            expandableListDetail["Sabbanāma group"] = sabbanāmaGroup

            return expandableListDetail
        }
}