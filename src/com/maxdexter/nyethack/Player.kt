package com.maxdexter.nyethack

class Player(private val name: String) {
    var nameCapitalize = name
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }
    var healthPoints = 89
    val isBlessed = true
    private val isImmortal = false

    fun castFireball(numFireballs:Int = 2){
        val playerState = when(numFireballs){
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


    fun formatHealthStatus(): String {
        return when (healthPoints) {
            100 -> " is in excellent condition!"
            in 90..99 -> " has a few scratches."
            in 75..89 -> when (isBlessed) {
                true -> " has some minor wounds but is healing quite quickly!"
                else -> " has some minore wounds."
            }
            in 15..74 -> " looks pretty hurt."
            else -> " is in awful condition!."
        }
    }

    fun auraColor(): String =
            if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"

}