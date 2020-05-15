/**
 * ProblemNo15651.kt
 * N & M 3
 * https://www.acmicpc.net/problem/15651
 */

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val range = nextInt() // N
    val maxDepth = nextInt() // M
    val nm = NAndM(range, maxDepth)

    nm.solveProblem(3)
}
