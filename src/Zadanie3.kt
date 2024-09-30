fun main() {
    println("Введите натуральное число в десятичной системе счисления:")
    val decimalNumber = readLine()?.toIntOrNull()

    if (decimalNumber == null || decimalNumber <= 0) {
        println("Некорректный ввод. Введите натуральное число.")
        return
    }

    val binaryNumber = decimalNumber.toBinaryString()
    println("Двоичное представление числа $decimalNumber: $binaryNumber")
}

fun Int.toBinaryString(): String {
    var number = this
    val binaryStringBuilder = StringBuilder()

    while (number > 0) {
        binaryStringBuilder.append(number % 2)
        number /= 2
    }

    return binaryStringBuilder.reverse().toString()
}
