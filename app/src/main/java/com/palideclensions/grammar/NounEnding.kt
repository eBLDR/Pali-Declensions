package com.palideclensions.grammar

class NounEnding(
    val ending: String,
)

val endingA = NounEnding("a")
val endingĀ = NounEnding("ā")
val endingI = NounEnding("i")
val endingĪ = NounEnding("ī")
val endingU = NounEnding("u")
val endingŪ = NounEnding("ū")
val endingNT = NounEnding("nt")

val allEndings = listOf(
    endingA,
    endingĀ,
    endingI,
    endingĪ,
    endingU,
    endingŪ,
    endingNT,
)