package a

import java.time.LocalTime

fun greet(time: LocalTime, name: String): String {
    val timeOfTheDay = when {
        time.isBefore(LocalTime.of(5, 0)) -> "night"
        time.isBefore(LocalTime.of(12, 0)) -> "morning"
        time.isBefore(LocalTime.of(17, 0)) -> "afternoon"
        time.isBefore(LocalTime.of(22, 0)) -> "evening"
        else -> "night"
    }
    return "Good $timeOfTheDay, $name"
}