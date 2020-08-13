package nyethack

fun main(){
    val name = "Madrigal"
    var healthPonts = 89
    val isBlessed = true
    val isImmortal = false
    val auraColor = auraColor(isBlessed, healthPonts, isImmortal)
    val healthStatus = formatHealthStatus(healthPonts, isBlessed)
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    castFireball()
}

private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    //Состояние игрока
    println("(Aura: $auraColor) " + "(Blessed: ${if (isBlessed) "YES" else "NO"})") //пример шаблонной строки
    println("$name $healthStatus") //Шаблонные строки
}

private fun auraColor(isBlessed: Boolean, healthPonts: Int, isImmortal: Boolean): String =
     if (isBlessed && healthPonts > 50 || isImmortal) "GREEN" else "NONE"


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
private fun castFireball(numFireballs:Int = 2){
   var playerState = when(numFireballs){
          in 1..10 -> "Tipsy"
          in 11..20 -> "Sloshed"
          in 21..30 -> "Soused"
          in 31..40 -> "Stewed"
          in 41..50 -> "Toasted"
          else -> "Toasted"
      }
    println("A glass of Fireball springs into existence. (x$numFireballs) player is $playerState.")
}

/** функция может иметь значение по умолчанию,
 и так как функция содержит одно выражение то можно
не использовать фигурные скобки*/


