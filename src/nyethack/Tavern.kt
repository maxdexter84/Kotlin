package nyethack
import kotlin.math.roundToInt
const val TAVERN_NAME = "Taernyl's Folly"
var playerGold = 10
var playerSilver = 10
fun main(){

   placeOrder("shandy,Dragon's Breath,5.91")

}

fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speaks with $tavernMaster about their order.")
    val (type, name, price) = menuData.split(',')
    val message = "Madrigal buys a $name ($type) for $price."

    println(message)
    performPurchase(price.toDouble())
    val phrase = if (name == "Dragon's Breath") {
        "Madrigal exclaims ${toDragonSpeak("Ah, delicious $name!")}"
    } else {
        "Madrigal says: Thanks for the $name."
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

fun performPurchase(price: Double) {
    displayBalance()
    val totalPurse = playerGold + (playerSilver / 100.0)
    val remainingBalance = totalPurse - price

    println("Total purse $totalPurse")
    println("Purchasing item for $price")
    println("Remaining balance: ${"%.2f".format(remainingBalance)}")
    val remainingGold = remainingBalance.toInt()
    val remainingSilver = (remainingBalance % 1 * 100).roundToInt()
    playerGold = remainingGold
    playerSilver = remainingSilver
    displayBalance()
}

private fun displayBalance(){
    println("Player's purse balance: Gold: $playerGold , Silver: $playerSilver")
}

