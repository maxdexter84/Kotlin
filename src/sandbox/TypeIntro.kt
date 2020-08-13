const val MAX_EXPERIENCE: Int = 5000 //Константа времени компиляции

fun main() {
    var experiencePoints = 5
    experiencePoints += 5

    //var изменяема переменная
    // val неизменяемая переменная
    val playerName ="Max"

    println(experiencePoints )
    println(playerName )
    var hasSteed = false
    val innkeeperName = null
    val tavernName = "Рог Единорога"
    var coins = 50
    var honey = true
    var wine = true
    var beer = true
    val list = ArrayList<Boolean>(listOf(honey,wine,beer))


    println(playerName.reversed())

   /**Анонимные функции*/
    val num = "Mississippi".count() //функция count возвращает количество букв в слове, моно так же использовать length
           /** с помощью анонимной функции можно вернуть количество конкретных букв в слове*/
           val num2 = "Mississippi".count { letter -> letter == 's'}
    println(num2)

    val str2 = "Максим Сазонов".count { letter -> letter == 'с' }
    println(str2)
}