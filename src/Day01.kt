val REPLACEMENTS = listOf(
    "one" to "o1e",
    "two" to "t2o",
    "three" to "t3e",
    "four" to "f4r",
    "five" to "f5e",
    "six" to "s6x",
    "seven" to "s7n",
    "eight" to "e8t",
    "nine" to "n9e"
)

fun main() {

    readInput("Day01").let {
        part1(it).println()
        part2(it).println()
    }

}


fun part1(input: List<String>) = input.sumOf { line ->
    val firstDigit = line.find { it.isDigit() }
    val lastDigit = line.findLast { it.isDigit() }
    "$firstDigit$lastDigit".toInt()
}

fun part2(input: List<String>) = input.sumOf { rawLine ->
    val line = REPLACEMENTS.fold(rawLine) { previous, replacement ->
        previous.replace(replacement.first, replacement.second)
    }
    val firstDigit = line.find { it.isDigit() }
    val lastDigit = line.findLast { it.isDigit() }
    "$firstDigit$lastDigit".toInt()
}