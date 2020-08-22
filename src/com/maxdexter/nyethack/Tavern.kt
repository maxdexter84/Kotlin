
package com.maxdexter.nyethack
import java.io.File

const val TAVERN_NAME = "Taernyl's Folly"
    val patronList = mutableListOf("Eli", "Mardock", "Sophi")
    val patronGold = mutableMapOf<String, Double>()
    val menuList = File("data/tavern-menu-data.txt").readText().split("\n")
    val lastName = listOf("Ironfoot", "Fernsworth", "Baggins")
    val uniquePatrons = mutableSetOf<String>()
    var orderCount = 0
fun main(){

    (0..9).forEach {
        val first = patronList.random()
        val last = lastName.random()
        val name = "$first $last"
        uniquePatrons += name
    }

    uniquePatrons.forEach { patronGold += it to 6.0}
    while (orderCount <= 9) {
        placeOrder(uniquePatrons.random(), menuList.random() )
        orderCount++
    }
    displayPatronBalances()
            //bouncer()
}

fun placeOrder(namePatron: String, menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("$namePatron speaks with $tavernMaster about their order.")
    val (type, name, price) = menuData.split(',')
    val message = "$namePatron buys a $name ($type) for $price."

    println(message)
     performPurchase(price.toDouble(), namePatron)
    val phrase = if (name == "Dragon's Breath") {
        "$namePatron exclaims ${toDragonSpeak("Ah, delicious $name!")}"
    } else {
        "$namePatron says: Thanks for the $name."
    }
    println(phrase.toUpperCase())
}

fun toDragonSpeak(fraze: String) =
    fraze.replace(Regex("[aeiou AEIOU]")) {
        when (it.value) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
    }

fun performPurchase(price: Double, patronName: String) {
    val totalPurse = patronGold.getValue(patronName)
    patronGold[patronName] = totalPurse - price
}

private fun displayPatronBalances() {
    patronGold.forEach { patron, balance -> println("Name $patron, balance: ${"%.2f".format(balance)}") }

}

private fun bouncer(){
    patronGold.forEach{ name, gold ->
        if (gold <= 0.0) {
            println("$name  doesn't have any money and he has to leave ")
            patronGold.remove(name)
        }
    }
}