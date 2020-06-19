package nyethack

fun main(){
    val name = "Madrigal"
var healthPonts = 89
val isBlessed = true
val isImmortal = false
val auraVisible = isBlessed && healthPonts > 50 || isImmortal

//Аура
    val  auraColor = if (auraVisible)"GREEN" else "NONE"
    println("(Aura: $auraColor) " + "(Blessed: ${if (isBlessed)"YES" else "NO"})") //пример шаблонной строки
    val healthStatus = when(healthPonts) {
        100 -> " is in excellent condition!"
        in 90..99 -> " has a few scratches."
        in 75..89 -> when (isBlessed) {
            true ->  " has some minor wounds but is healing quite quickly!"
            else ->" has some minore wounds."
        }
        in 15..74 -> " looks pretty hurt."
        else -> " is in awful condition!."

    }

//Состояние игрока
    println("$name $healthStatus") //Шаблонные строки

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
}