package nyethack

fun main(){
val name = "Madrigal"
var healthPonts = 89
val isBlessed = true
val isImmortal = false
val auraVisible = isBlessed && healthPonts > 50 || isImmortal

//Аура
    if(auraVisible){
        println("GREEN")
    }else{
        println("NONE")
    }
    val healthStatus = if (healthPonts == 100){
        " is in excellent condition!"
    } else if(healthPonts >= 90){
        " has a few scratches."
    }else if (healthPonts >=75){
        if(isBlessed){
            " has some minor wounds but is healing quite quickly!"
        }else " has some minore wounds."
    }else if (healthPonts >= 15){
        " looks pretty hurt."
    }else{
        " is in awful condition!."
    }

//Состояние игрока
    println(name + healthStatus)
}