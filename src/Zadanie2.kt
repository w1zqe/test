fun main()
{
    println("Введите строку:")
    val inputString = readLine() ?: ""

    if (inputString.isEmpty())
    {
        println("Строка не может быть пустой.")
        return
    }

    val charCounts = mutableMapOf<Char, Int>()
    for (char in inputString)
    {
        charCounts[char] = (charCounts[char] ?: 0) + 1
    }

    val sortedChars = charCounts.keys.sorted()

    for (char in sortedChars)
    {
        println("$char - ${charCounts[char]}")
    }
}
