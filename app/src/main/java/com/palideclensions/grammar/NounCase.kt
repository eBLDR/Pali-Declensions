package com.palideclensions.grammar

class NounCase(
    val namePali: String,
    val nameEng: String,
    val nameEngShort: String,
)

val nounCaseNominative = NounCase("paṭhamā", "nominative", "nom.")
val nounCaseVocative = NounCase("ālapana", "vocative", "voc.")
val nounCaseAccusative = NounCase("dutiya", "accusative", "acc.")
val nounCaseInstrumental = NounCase("tatiyā", "instrumental", "ins.")
val nounCaseDative = NounCase("catutthī", "dative", "dat.")
val nounCaseAblative = NounCase("pañcamī", "ablative", "abl.")
val nounCaseGenitive = NounCase("chaṭṭhī", "genitive", "gen.")
val nounCaseLocative = NounCase("sattamī", "locative", "loc.")

val allCaseNouns = listOf(
    nounCaseNominative,
    nounCaseVocative,
    nounCaseAccusative,
    nounCaseInstrumental,
    nounCaseDative,
    nounCaseAblative,
    nounCaseGenitive,
    nounCaseLocative,
)