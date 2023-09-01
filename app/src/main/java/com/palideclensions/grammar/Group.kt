package com.palideclensions.grammar

class Group(
    val namePali: String,
    val nameEng: String,
)

// TODO: review pali names
val groupPurisa = Group("purisādigaṇa", "purisa group")
val groupCitta = Group("cittādigaṇa", "citta group")
val groupKaññā = Group("kaññādigaṇa", "kaññā group")
val groupMano = Group("manādigaṇa", "mano group")
val groupPuma = Group("pumādigaṇa", "puma group")
val groupRāja = Group("rājādigaṇa", "rāja group")
val groupSatthu = Group("satthādigaṇa", "satthu group")
val groupGuṇavantu = Group("guṇavantādigaṇa", "guṇavantu group")
val groupGacchanta = Group("gacchantādigaṇa", "gacchanta group")
val groupRatti = Group("rattādigaṇa", "ratti group")
val groupNadī = Group("nadādigaṇa", "nadī group")
val groupGahapatānī = Group("gahapatānādigaṇa", "gahapatānī group")
val groupSabbanāma = Group("sabbanāmādigaṇa", "sabbanāma group")

val allGroups = listOf(
    groupPurisa,
    groupCitta,
    groupKaññā,
    groupMano,
    groupPuma,
    groupRāja,
    groupSatthu,
    groupGuṇavantu,
    groupGacchanta,
    groupRatti,
    groupNadī,
    groupGahapatānī,
    groupSabbanāma,
)