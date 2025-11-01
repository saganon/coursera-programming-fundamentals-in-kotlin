package org.playground.game

class Scores {
    fun bestAchieved(
        best: Int,
        current: Int,
    ): Int {
        if (best < current) {
            return current
        }
        return best
    }

    fun totalScore(current: Int, newScore: Int): Int {
        return newScore + current
    }

    fun highestScore(player1: Player, player2: Player): Player {
        return if (player1.totalScore >= player2.totalScore) player1 else player2
    }
}
