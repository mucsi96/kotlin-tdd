package a

fun main(args: Array<String>) {
    for (i in 1..100) {
        println(fizzBazz(i))
    }
}

fun fizzBazz(i: Int): String {
    return if (i % 3 == 0 && i % 5 == 0) "FizzBuzz"
    else if (i % 3 == 0) "Fizz"
    else if (i % 5 == 0) "Buzz"
    else i.toString();
}