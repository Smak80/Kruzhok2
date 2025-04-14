import kotlin.random.Random

fun main() {
    // Базовый синтаксис: условия
    var i = 0
    var j = 1
    var k = if (i == j){
        1
    } else {
        2
    }
    // Базовый синтаксис: особенности циклов и оператора выбора
    for (i in 1..< 10){
        println(when{
            i % 3 == 0 -> i % 3
            i % 3 == 1 -> i / 3
            else -> "-"
        })
    }
    // Базовый синтаксис: объявление массивов
    val ia = DoubleArray(10)
    for(elem in ia){
        println(elem)
    }
    val x: Double = 0.0
    val a = Array(10) { (it * it).toDouble()}
    val c = Array(10){Random.nextInt(-10,11)}
}