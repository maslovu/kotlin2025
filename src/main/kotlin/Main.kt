package ru.maslov

const val HERO_NAME = "Jenifer"
var playerLevel = 0

fun main() {
    println("$HERO_NAME announces her presence to the world")
    println("What level is $HERO_NAME")
    playerLevel = readLine()!!.toInt();

    println("$HERO_NAME's level is $playerLevel")
    readBountyBoard()

    println("Time passed...")
    println("$HERO_NAME returns from the quest.")

    playerLevel += 1
    println(playerLevel)
    readBountyBoard()
}

private fun readBountyBoard() {
    println("""
        |$HERO_NAME approaches the bounty board. It reads:
        |   ${obtainQuest(playerLevel)}
    """.trimMargin())
}

private fun obtainQuest(
    playerLevel: Int,
    playerClass: String = "paladin",
    hasBefriendedBarbarians: Boolean = true,
    hasAngeredBarbarians: Boolean = false
): String = when (playerLevel) {
    1 -> "Meet Mr. Bubbles in the land of soft things."
    in 2..5 -> {
        val canTalkToBarbarians = !hasAngeredBarbarians || (hasBefriendedBarbarians && playerClass == "barbarian")
        if (canTalkToBarbarians) {
            "Convince the barbarians to call off their invasion"
        } else {
            "Save the town from barbarian invasions"
        }
    }

    6 -> "Locate the enchanted sword."
    7 -> "Recover the long-lost artifact of creation"
    8 -> "Defeat Nogartse, bringer of death and eater of worlds"
    else -> "There are no quest right now"
}
