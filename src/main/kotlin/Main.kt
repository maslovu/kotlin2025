package ru.maslov

const val HERO_NAME = "Jenifer"

fun main() {
    println("The hero announces her presence to the world")

    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)

    val hasBefriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"

    val quest: String = when (playerLevel) {
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

    println("The hero approaches the bounty board. It reads:")
    println(quest)
    println("Time passed...")
    println("The hero returns from the quest.")

    playerLevel += 1
    println(playerLevel)
}