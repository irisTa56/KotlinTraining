package io.access.kotlintraining

fun welcome() {
    println("welcome to ACCESS!")
}

// hello function

fun hello() {
    println("Goodbye World!")
}

// Exercise (1) FizzBuzz

fun fizzBuzzAt(n: Int): String {
    return when {
        n % 15 == 0 -> "FizzBuzz"
        n % 5 == 0 -> "Buzz"
        n % 3 == 0 -> "Fizz"
        else -> "$n"
    }
}

fun fizzBuzz(first: Int = 1, last: Int = 100) {
    for (i in first..last) {
        println(fizzBuzzAt(i))
    }
}

// Exercise (1) leap year

fun isLeapYear(y: Int): Boolean {
    return when {
        y % 4 == 0 -> ! (y % 100 == 0 && y % 400 != 0)
        else -> false
    }
}

//  Exercise (1) power

fun power(a: Int, n: Int): Long {

    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0
    }

    return if (n == 1) {
        a.toLong()
    } else {
        a * power(a, n-1)
    }
}

//  Exercise (2) isOdd/Even

fun Int.isOdd() = this % 2 != 0
fun Int.isEven() = this % 2 == 0

//  Exercise (2) dice

class Dice constructor(private val n: Int = 6) {
    var counter: Int = 0

    init {
        require(n > 0)
    }

    fun roll(): Int {
        if (++counter > 100) {
            throw Exception("I was broken")
        }
        return (1..n).random()
    }
}

// Exercise (2) property with counter

class MyCustomClass {
    var counter: Int = 0
    var propertyWithCounter: Int = 0
     set(i) {
         counter += 1
         field = i
     }
}

// Exercise (2) NabeAtsu

class NabeAtsu {
    var counter: Int = 0

    fun next(): String {
        counter += 1
        return when {
            counter % 3 == 0 -> "Aho"
            "3" in "$counter" -> "Aho"
            else -> "$counter"
        }
    }
}

// Exercise (3)

interface Mailer {
    fun sendMessage(email: String, message: String) {
        println("Send $message to $email")
    }
}

class Client (val personalInfo: PersonalInfo? = null)
class PersonalInfo (val email: String? = null)
class GMailer: Mailer


fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    val email: String? = client?.personalInfo?.email
    mailer.sendMessage(email ?: "@nowhere", message ?: "Nobody")
}

