package com.maxdexter.nyethack

fun main(){
    val player = Player("madrigal")
    printPlayerStatus(player)
    player.castFireball()
}

private fun printPlayerStatus(player: Player) {
    //Состояние игрока
    println("(Aura: ${player.auraColor()}) " + "(Blessed: ${if (player.isBlessed) "YES" else "NO"})") //пример шаблонной строки
    println("${player.nameCapitalize} ${player.formatHealthStatus()}") //Шаблонные строки
}



private fun initRace() {
    //применение условного выражения when
    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "This race doesn`t exist"
    }
    println("$race $faction")
}





