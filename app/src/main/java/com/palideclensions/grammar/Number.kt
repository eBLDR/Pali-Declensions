package com.palideclensions.grammar

class Number(
    val namePali: String,
    val nameEng: String,
    val nameEngShort: String,
)

val numberSingular = Number("ekavacana", "singular", "sin.")
val numberPlural = Number("bahuvacana", "plural", "pl.")

val allNumbers = listOf(numberSingular, numberPlural)
