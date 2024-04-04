
#include <vector>
#include <string>
#include <algorithm>
#include <string_view>
using namespace std;

class Solution {

    vector<int> shortestDistanceToPivot;

public:
    vector<int> shortestToChar(const string& input, char pivot) {
        shortestDistanceToPivot.resize(input.length());
        ranges::fill(shortestDistanceToPivot, input.length());

        fillShortestDistanceToPivot(0, input, pivot);
        fillShortestDistanceToPivot(input.length() - 1, input, pivot);
        return shortestDistanceToPivot;
    }

private:
    void fillShortestDistanceToPivot(size_t startIndex, string_view input, char pivot) {
        size_t end = (startIndex == 0) ? input.length() : variant_npos;
        size_t step = (startIndex == 0) ? 1 : -1;
        int distance = input.length();

        for (size_t i = startIndex; i != end; i += step) {
            distance = (input[i] == pivot) ? 0 : distance + 1;
            shortestDistanceToPivot[i] = min(distance, shortestDistanceToPivot[i]);
        }
    }
};
