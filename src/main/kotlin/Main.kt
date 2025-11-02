package org.playground

import org.playground.game.game
import org.playground.nullability.getStudentById
import org.playground.nullability.searchInStudents

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    forLoopCourse()
    score()
    println(factorial(2)) // 2
    println(factorial(3)) // 6
    val game = game()

    println("Please, Enter the ID of the student\n")
    val id: Int = readln().toInt()
    val student = getStudentById(id)
    println(student)

    println("Please, Enter the student's name\n")
    val name = readln()
    println(searchInStudents(name) ?: "The student is not found")
}
