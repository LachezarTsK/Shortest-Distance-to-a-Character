
/**
 * @param {string} input
 * @param {character} pivot
 * @return {number[]}
 */
var shortestToChar = function (input, pivot) {
    this.shortestDistanceToPivot = new Array(input.length).fill(input.length);

    fillShortestDistanceToPivot(0, input, pivot);
    fillShortestDistanceToPivot(input.length - 1, input, pivot);
    return shortestDistanceToPivot;
};

/**
 * @param {number} startIndex
 * @param {string} input
 * @param {character} pivot 
 * @return {void}
 */
function fillShortestDistanceToPivot(startIndex, input, pivot) {
    let end = (startIndex === 0) ? input.length : -1;
    let step = (startIndex === 0) ? 1 : -1;
    let distance = input.length;

    for (let i = startIndex; i !== end; i += step) {
        distance = (input.charAt(i) === pivot) ? 0 : distance + 1;
        this.shortestDistanceToPivot[i] = Math.min(distance, this.shortestDistanceToPivot[i]);
    }
}
