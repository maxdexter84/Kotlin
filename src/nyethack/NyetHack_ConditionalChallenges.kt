package nyethack

import kotlin.math.pow

fun main(){
    val name = "Madrigal"
var healthPonts = 30
val isBlessed = true
val isImmortal = false
val auraVisible = isBlessed || isImmortal
val karma = (Math.pow(Math.random(), (110 - healthPonts) / 100.0) * 20).toInt()
println(karma)
//Аура
    val  auraColor = if (auraVisible){
        when (karma){
            in 0..5 -> "Red"
            in 6..10 -> "Orange"
            in 11..15 -> "Purple"
            in 16..20 -> "Green"
            else -> "NONE"
        }
    }else "NONE"

   // println("(Aura: $auraColor) " + "(Blessed: ${if (isBlessed)"YES" else "NO"})") //пример шаблонной строки
    val healthStatus = formatHealthStatus(healthPonts, isBlessed)


//применение условного выражения when
    val race = "gnome"
    val faction = when (race){
        "dwarf"->"Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "This race doesn`t exist"
    }
    println("$race $faction")

    val A = "Aura: $auraColor"
    val H = "$name $healthStatus"
    val HP = "HP: $healthPonts"
    val statusFormatString = "($HP)($A) -> $H"
    println(statusFormatString)
}

private fun formatHealthStatus(healthPonts: Int, isBlessed: Boolean): String {
    val healthStatus = when (healthPonts) {
        100 -> " is in excellent condition!"
        in 90..99 -> " has a few scratches."
        in 75..89 -> when (isBlessed) {
            true -> " has some minor wounds but is healing quite quickly!"
            else -> " has some minore wounds."
        }
        in 15..74 -> " looks pretty hurt."
        else -> " is in awful condition!."
    }
    return healthStatus
}