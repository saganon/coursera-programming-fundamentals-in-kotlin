package org.playground

fun getPoints(basePoint: Int, boost: Int): Int {
    return basePoint * boost;
}

fun score() {
    var score = 0;
    println(score)
    score += getPoints(10, 1)
    println(score)
    score += getPoints(20, 2)
    println(score)
    score += getPoints(-10, 1)
    println(score)
    score += getPoints(5, 3)
    println(score)
    score += getPoints(-15, 2)
    println(score)
}