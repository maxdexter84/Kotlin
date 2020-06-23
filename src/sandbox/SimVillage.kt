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
//fun main(){
//    val greetingFunction: ()-> String = {val currentYear = 2018
//    "Welcome to SimVillage, Mayor! (copyright $currentYear)"}
//
//    println(greetingFunction())
//}
/**Анонимные функции так же как и именованные функции,могут принимать любое колличество аргументов.
 * */
//fun main(){
//    val greetingFunction:(String)-> String = {playerName -> val currentYear = 2018
//    "Welcom to SimVillage, $playerName! (copyright $currentYear)"}
//
//    println(greetingFunction("Guyal"))
//}
/** в анонимных функции, которая принимает ровно один аргумент, вместо определения имени параметра
 * можно использовать ключевое слово "it" */
//fun main(){
//    val greetingFunction:(String)-> String = {val currentYear = 2018
//        "Welcom to SimVillage, $it! (copyright $currentYear)"}
//
//    println(greetingFunction("Guyal"))
//
//
//    println("Mississippi".count{it == 's'})
//}

/**Анонимные функции могут принимать несколько именованых аргументов */
//fun main(){
//    val greetingFunction:(String , Int) -> String = {playerName, numBuildings -> val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName!(copyright $currentYear)"}
//
//    println(greetingFunction("Guyal",2))
//}
/**Автоматическое определение типов по отношению к функциональным типам отноиться точно так же,
 * то есть если при объявлении переменной присваивается анонимная функция то явно объявлять ее тип не требуется*/
//val greetingFunction = {
//    val currentYear = 2018
//    "Welcome to SimVillage, Mayor!"
//}

/**Или с параметрами*/
//fun main(){
//    val greetingFunction = { playerName: String, numBuildings: Int ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName!(copyright $currentYear)"}
//  runSimulation("Guyal",greetingFunction)
//}

/**Параметр функции может принимать аргументы любого типа , даже аргументы которые сами являются функциями*/
//fun runSimulation(playerName:String, greetingFunction:(String,Int)->String){
//    val numBuildings = (1..3).shuffled().last() // случайно выберет значение от 1 до 3
//    println(greetingFunction(playerName,numBuildings))
//}

/**Когда функция принимает другу функцию в качестве параметра , круглые скобки в качестве аргумента с лямбдой можно отбросить*/
//fun main(){
//    runSimulation("Guyal") { playerName: String, numBuildings: Int ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName!(copyright $currentYear)"}
//}
//
//fun runSimulation(playerName:String, greetingFunction:(String,Int)->String){
//    val numBuildings = (1..3).shuffled().last() // случайно выберет значение от 1 до 3
//    println(greetingFunction(playerName,numBuildings))
//}
/**Лямбда представляется в JVM экземпляром объекта, что требует дополнительного выделения памяти для хранения этого объекта
 * но можно включить оптимизацию , которая избавит от чрезмерного расходования памяти
 * Это назвается встраиванием (инлайнинг) это избавляет JVM от необходимости использования экземпляра объекта и выделять память
 * для переменных в лямбде.
 * Что бывстроить лямбду надо отметить функцию принимающую лямбду ключевымсловом (inline)*/
//fun main(){
//    runSimulation("Guyal") { playerName: String, numBuildings: Int ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName!(copyright $currentYear)"}
//}
//
//inline fun runSimulation(playerName:String,
//                         greetingFunction:(String,Int)->String){
//    val numBuildings = (1..3).shuffled().last() // случайно выберет значение от 1 до 3
//    println(greetingFunction(playerName,numBuildings))
//}

/**Ссылка на функцию*/
//fun main(){
//    runSimulation("Guyal", ::printConstructionCost) { playerName: String, numBuildings: Int ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName!(copyright $currentYear)"}
//}
//
//inline fun runSimulation(playerName:String,
//                         costPrinter: (Int) -> Unit,
//                         greetingFunction:(String,Int)->String){
//    val numBuildings = (1..3).shuffled().last() // случайно выберет значение от 1 до 3
//    costPrinter(numBuildings)
//    println(greetingFunction(playerName,numBuildings))
//}
//fun printConstructionCost(numBuildings:Int){
//    val cost = 500
//    println("construction cost: ${cost * numBuildings}")
//}
/**Функциональный тип так же может быть возвращаемым типом.
 * Это значит что можно объявить функцию которая возвращает функцию*/
fun main(){
    runSimulation()
}
fun runSimulation(){
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return {playerName:String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}



