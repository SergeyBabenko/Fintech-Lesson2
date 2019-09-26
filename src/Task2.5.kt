fun main(args: Array<String>) {
    print("Введите Имя: ")
    val name: String? = readLine()

    print("Введите  Число1: ")
    val num1: Int? = readLine()?.toInt()

    print("Введите  Число2: ")
    val num2: Int? = readLine()?.toInt()

    print("$name получает $num1 через $num2 лет")
}