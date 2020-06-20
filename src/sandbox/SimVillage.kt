//fun main(){
//    println({val currentYear = 2018
//        "Welcome to SimVillage, Mayor!(copyright $currentYear)"
//    }())
//}
/**Анонимная функция сохдается внутри фигурных скобок {}
 * а для того что бы этафункция была вызвана надо поставить пустые кргулые скобки () после фигурных*/

/** в языке есть переменные с типом Function ,
 * такие переменные могут содержать анонимные функции и передаваться по коду как
 * обычные переменные
 */

//присваивание переменной анонимной функции
fun main(){
    val greetingFunction: ()-> String = {val currentYear = 2018
    "Welcome to SimVillage, Mayor! (copyright $currentYear)"}

    println(greetingFunction())
}