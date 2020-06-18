package nyethack

fun main(){
    val name = "Madrigal"
var healthPonts = 89
val isBlessed = true
val isImmortal = false
val auraVisible = isBlessed && healthPonts > 50 || isImmortal

//Аура
    val  auraColor = if (auraVisible)"GREEN" else "NONE"
    println(auraColor)
    val healthStatus = if (healthPonts == 100){
        " is in excellent condition!"
    } else if(healthPonts in 90..99){
        " has a few scratches."
    }else if (healthPonts in 75..89){
        if(isBlessed){
            " has some minor wounds but is healing quite quickly!"
        }else " has some minore wounds."
    }else if (healthPonts in 15..74){
        " looks pretty hurt."
    }else{
        " is in awful condition!."
    }

//Состояние игрока
    println(name + healthStatus)
}