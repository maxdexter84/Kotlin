package nyethack

fun main(){
//    var beverage = readLine()?.let {
//        if (it.isNotBlank()) {
//            it.capitalize()
//        }else "Buttered Ale"
//    }

//    var beverage = readLine()!!.capitalize() // не рекомендуемый способ

//    var beverage = readLine()  //этот вариант проверки на null  лучше подходит при сложных вычеслениях
//    if (beverage != null) beverage.capitalize() else print("Error")
//       beverage = null

    //Еще один способ проверки на null , это использования оператора элвис ?: (если операнд слева от меня null значит выполнить операцию с права)

    var beverage = readLine()?.capitalize()?.plus(" large")
    beverage = null
    var beverageServed: String = beverage ?: "Buttered Ale"
    println(beverageServed)

}

