package org.playground.game

class Player(
    val name: String,
    val surName: String,
) {
    var totalScore = 0
    var personalBestScore = 0

    fun fullName(): String = "$name $surName"

    fun winner(): String = "Winner ${fullName()} with a combined score of $totalScore and a personal best level score of $personalBestScore"
}
