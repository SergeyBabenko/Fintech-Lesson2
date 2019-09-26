import kotlin.random.Random

fun main() {
    var array = Array<Int>(10) { Random.nextInt(0, 100) }
    println("Source array: ${array.asList()}")
    array = sortArray(array)
    println("Result array: ${array.asList()}")
}

fun sortArray(array: Array<Int>): Array<Int> {
    for (i in 0 until array.size)
        for (j in 0 until array.size - i - 1)
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
    return array
}