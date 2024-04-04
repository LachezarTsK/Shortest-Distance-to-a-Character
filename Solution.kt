
import kotlin.math.min

class Solution {

    fun shortestToChar(input: String, pivot: Char): IntArray {

        val shortestDistanceToPivot = IntArray(input.length) { input.length }

        fillShortestDistanceToPivot(0, input, pivot, shortestDistanceToPivot);
        fillShortestDistanceToPivot(input.length - 1, input, pivot, shortestDistanceToPivot);
        return shortestDistanceToPivot
    }

    private fun fillShortestDistanceToPivot
                (startIndex: Int, input: String, pivot: Char, shortestDistanceToPivot: IntArray): Unit {
        
        val range = if (startIndex == 0) 0..<(input.length) else (startIndex).downTo(0)
        var distance = input.length

        for (i in range) {
            distance = if (input[i] == pivot) 0 else distance + 1;
            shortestDistanceToPivot[i] = min(distance, shortestDistanceToPivot[i]);
        }
    }
}
