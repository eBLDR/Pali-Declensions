package com.palideclensions.grammar

class NounCaseNumber(
    val nounCase: NounCase,
    val number: Number,
)

val nomSin = NounCaseNumber(nounCaseNominative, numberSingular)
val nomPl = NounCaseNumber(nounCaseNominative, numberPlural)
val vocSin = NounCaseNumber(nounCaseVocative, numberSingular)
val vocPl = NounCaseNumber(nounCaseVocative, numberPlural)
val accSin = NounCaseNumber(nounCaseAccusative, numberSingular)
val accPl = NounCaseNumber(nounCaseAccusative, numberPlural)
val insSin = NounCaseNumber(nounCaseInstrumental, numberSingular)
val insPl = NounCaseNumber(nounCaseInstrumental, numberPlural)
val datSin = NounCaseNumber(nounCaseDative, numberSingular)
val datPl = NounCaseNumber(nounCaseDative, numberPlural)
val ablSin = NounCaseNumber(nounCaseAblative, numberSingular)
val ablPl = NounCaseNumber(nounCaseAblative, numberPlural)
val genSin = NounCaseNumber(nounCaseGenitive, numberSingular)
val genPl = NounCaseNumber(nounCaseGenitive, numberPlural)
val locSin = NounCaseNumber(nounCaseLocative, numberSingular)
val locPl = NounCaseNumber(nounCaseLocative, numberPlural)

val allCaseNumbers = listOf(
    nomSin, nomPl,
    vocSin, vocPl,
    accSin, accPl,
    insSin, insPl,
    datSin, datPl,
    ablSin, ablPl,
    genSin, genPl,
    locSin, locPl,
)