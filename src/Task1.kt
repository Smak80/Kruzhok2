// Решение на Kotlin для задачи поиска непрерывной части массива
// с наибольшей суммой элементов (алгоритм Кадана)
fun findMaxSumSlice(arr: IntArray): IntArray{
    var start = 0
    var end = 0
    var currSum = arr[start] // Текущая сумма
    var maxSum = arr[start]  // Максимальная сумма
    for (i in 1..<arr.size){
        if (currSum + arr[i] > arr[i]) {
            currSum += arr[i]
        } else {
            currSum = arr[i]
            start = i
        }
        if (currSum > maxSum){
            maxSum = currSum
            end = i
        }
    }
    // Получаем срез по заданным индексам для массива
    return arr.slice(start..end).toIntArray()
}

fun main() {
    val b = intArrayOf(2, 5, 4, -71, 0, 8, -2, 4, 3, 0)
    val res = findMaxSumSlice(b)
    println(res.joinToString()) // вывод массива в виде строки
    println(res.sum()) // вывод макс. суммы
}