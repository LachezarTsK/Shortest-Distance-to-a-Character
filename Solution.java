
import java.util.Arrays;

public class Solution {

    private int[] shortestDistanceToPivot;

    public int[] shortestToChar(String input, char pivot) {
        shortestDistanceToPivot = new int[input.length()];
        Arrays.fill(shortestDistanceToPivot, input.length());

        fillShortestDistanceToPivot(0, input, pivot);
        fillShortestDistanceToPivot(input.length() - 1, input, pivot);
        return shortestDistanceToPivot;
    }

    private void fillShortestDistanceToPivot(int startIndex, String input, char pivot) {
        int end = (startIndex == 0) ? input.length() : -1;
        int step = (startIndex == 0) ? 1 : -1;
        int distance = input.length();

        for (int i = startIndex; i != end; i += step) {
            distance = (input.charAt(i) == pivot) ? 0 : distance + 1;
            shortestDistanceToPivot[i] = Math.min(distance, shortestDistanceToPivot[i]);
        }
    }
}
