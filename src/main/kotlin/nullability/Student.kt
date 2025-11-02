package org.playground.nullability

data class Student(
    val id: Int,
    val fullName: String,
    val grade: Double,
)

val students =
    mutableListOf<Student>(
        Student(223, "John", 140.0),
        Student(548, "Mark", 120.0),
        Student(342, "Natali", 150.0),
        Student(781, "Sara", 130.0),
    )

fun getStudentById(id: Int): Student = students.find { it.id == id }!!

fun searchInStudents(name: String): Student? = students.find { it.fullName.lowercase() == name.lowercase() }
