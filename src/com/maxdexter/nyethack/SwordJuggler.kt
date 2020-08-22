package com.maxdexter.nyethack

import java.lang.IllegalStateException

fun main() {
    var swordJuggling: Int? = null
    val isJugglingProficient = (1..3).random() == 3

    if (isJugglingProficient) {
        swordJuggling = 2
    }
    try {
        proficiencyCheck(swordJuggling)
        swordJuggling = swordJuggling!!.plus(1)
    }catch (e: Exception) {
        e.printStackTrace()
    }

    println("You juggle $swordJuggling swords!! ")
}

fun proficiencyCheck(sw: Int?) {
  //  sw ?: throw UnskilledSwordJugglerException()
    checkNotNull(sw, { "Player cannot juggle swords" })
    require(sw >= 3, {"Need 3 swords"})
}
class UnskilledSwordJugglerException() : IllegalStateException("Player cannot juggle swords")