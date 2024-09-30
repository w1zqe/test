fun main() {
    println("Введите строку:")
    val inputString = readLine() ?: ""

    if (inputString.isEmpty()) {
        println("Строка не может быть пустой.")
        return
    }

    val output = StringBuilder()
    var currentChar = inputString[0]
    var count = 1

    for (i in 1 until inputString.length) {
        if (inputString[i] == currentChar) {
            count++
        } else {
            if (count > 1) {
                output.append(currentChar).append(count)
            } else {
                output.append(currentChar)
            }
            currentChar = inputString[i]
            count = 1
        }
    }


    if (count > 1) {
        output.append(currentChar).append(count)
    } else {
        output.append(currentChar)
    }

    println("Результат: $output")
}
