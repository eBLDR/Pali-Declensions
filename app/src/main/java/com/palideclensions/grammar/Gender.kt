package com.palideclensions.grammar

class Gender(
    val namePali: String,
    val nameEng: String,
    val nameEngShort: String,
)

val genderMasculine = Gender("purisa", "masculine", "m.")
val genderNeuter = Gender("napuṁsaka", "neuter", "nt.")
val genderFeminine = Gender("itthi", "feminine", "f.")
val genderNone = Gender("aliṅgika", "no-gender", "0.")
val genderTwo = Gender("dviliṅgika", "two-gender", "2.")
val genderThree = Gender("tiliṅgika", "three-gender", "3.")

val allGenders = listOf(genderMasculine, genderNeuter, genderFeminine)
