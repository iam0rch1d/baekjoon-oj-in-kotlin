/**
 * ProblemNo1463.kt
 * Make One
 * https://www.acmicpc.net/problem/1463
 */

import java.util.Scanner


class MakeOne {
    var memoCount = IntArray(1000001)

    fun countOperation(number: Int): Int {
        val temp = IntArray(3) { Int.MAX_VALUE }

        if (memoCount[number] == 0 && number != 1) { // Check if to go dynamic
            when {
                number in 2..3 -> { // Base case
                    memoCount[number] = 1
                    return 1
                }
                number % 3 == 0 -> { // Recursive step case 1
                    temp[0] = countOperation(number / 3)
                }
                number % 2 == 0 -> { // Recursive step case 2
                    temp[1] = countOperation(number / 2)
                }
            }

            temp[2] = countOperation(number - 1) // Recursive case 3
            memoCount[number] = 1 + temp.min()!!
        }

        return memoCount[number]
    }
}


fun main() = with(Scanner(System.`in`)) {
    val number = nextInt()
    val makeOne = MakeOne()

    println(makeOne.countOperation(number))
}
