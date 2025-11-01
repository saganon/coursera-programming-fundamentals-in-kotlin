package org.playground

import org.playground.game.Player
import org.playground.game.Scores

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    forLoopCourse()
//    score()
//    println(factorial(2)) // 2
//    println(factorial(3)) // 6
    val player1 = Player("Nicola", "Tesla")
    val player2 = Player("Thomas", "Edison")

    val scoring = Scores()
    var lvlScore = 0

    // level 1
    lvlScore = 20
    player1.totalScore = scoring.totalScore(player1.totalScore, lvlScore)
    player1.personalBestScore = scoring.bestAchieved(player1.personalBestScore, lvlScore)

    lvlScore = 30
    player2.totalScore = scoring.totalScore(player2.totalScore, lvlScore)
    player2.personalBestScore = scoring.bestAchieved(player2.personalBestScore, lvlScore)

    var highestScore = scoring.highestScore(player1, player2)
    println(highestScore.winner())

    // level 2
    lvlScore = 50
    player1.totalScore = scoring.totalScore(player1.totalScore, lvlScore)
    player1.personalBestScore = scoring.bestAchieved(player1.personalBestScore, lvlScore)

    lvlScore = 30
    player2.totalScore = scoring.totalScore(player2.totalScore, lvlScore)
    player2.personalBestScore = scoring.bestAchieved(player2.personalBestScore, lvlScore)

    highestScore = scoring.highestScore(player1, player2)
    println(highestScore.winner())

    // level 3
    lvlScore = 10
    player1.totalScore = scoring.totalScore(player1.totalScore, lvlScore)
    player1.personalBestScore = scoring.bestAchieved(player1.personalBestScore, lvlScore)

    lvlScore = 35
    player2.totalScore = scoring.totalScore(player2.totalScore, lvlScore)
    player2.personalBestScore = scoring.bestAchieved(player2.personalBestScore, lvlScore)

    highestScore = scoring.highestScore(player1, player2)
    println(highestScore.winner())
}
