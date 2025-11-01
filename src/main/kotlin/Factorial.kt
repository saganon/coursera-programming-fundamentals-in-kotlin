package org.playground

fun factorial(number: Int): Int {
    if (number <= 1) {
        return 1
    }
    println("${number - 1} * $number")
    return factorial(number - 1) * number
}
