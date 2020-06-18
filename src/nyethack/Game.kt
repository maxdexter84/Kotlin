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
    if (healthPonts == 100){
        println(name + " is in excellent condition!")
    }else if(healthPonts >= 90){
        println(name + " has a few scratches.")
    }else if (healthPonts >=75){
        if(isBlessed){
            println(name + " has some minor wounds but is healing quite quickly!")
        }else println(name + " has some minore wounds.")
    }else if (healthPonts >= 15){
        println(name + " looks pretty hurt.")
    }else{
        println(name + " is in awful condition!.")
    }


}