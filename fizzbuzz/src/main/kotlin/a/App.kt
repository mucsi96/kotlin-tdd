package a

fun main() {
    var i = 1
    while (true) {
        val out = fizzBazz(i)
        println(out)
        if (out == "FizzBuzzWhizzBang") break
        i++
    }
}

fun fizzBazz(i: Int): String {
    val output = listOf(
        3 to "Fizz",
        5 to "Buzz",
        7 to "Whizz",
        11 to "Bang"
    ).mapNotNull { (divisor, word) -> if (i % divisor == 0) word else null }
        .reduceOrNull { acc, s -> acc + s }

    return output ?: i.toString()
}