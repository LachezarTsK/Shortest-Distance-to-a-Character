
using System;

public class Solution
{
    private int[] shortestDistanceToPivot;

    public int[] ShortestToChar(string input, char pivot)
    {
        shortestDistanceToPivot = new int[input.Length];
        Array.Fill(shortestDistanceToPivot, input.Length);

        FillShortestDistanceToPivot(0, input, pivot);
        FillShortestDistanceToPivot(input.Length - 1, input, pivot);
        return shortestDistanceToPivot;
    }

    private void FillShortestDistanceToPivot(int startIndex, String input, char pivot)
    {
        int end = (startIndex == 0) ? input.Length : -1;
        int step = (startIndex == 0) ? 1 : -1;
        int distance = input.Length;

        for (int i = startIndex; i != end; i += step)
        {
            distance = (input[i] == pivot) ? 0 : distance + 1;
            shortestDistanceToPivot[i] = Math.Min(distance, shortestDistanceToPivot[i]);
        }
    }
}
