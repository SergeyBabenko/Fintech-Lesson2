fun main() {
    val n = 5
    val str = "Some text"
    repeatString(n, str)
}

fun repeatString(n: Int, str: String) {
    for (i in 0 until n)
        println(str)
}