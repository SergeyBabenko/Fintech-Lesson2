fun main(args: Array<String>) {
    val a = 5
    val b = 9
    val c = -6
    val d = 0
    getMinValue(a, b, c, d)
}

fun getMinValue(first: Int, second: Int, third: Int, fourth: Int) {
    val temp = if (first < second) first else second
    val temp2 = if (third < fourth) third else fourth
    println(if (temp < temp2) temp else temp2)
}