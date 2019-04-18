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