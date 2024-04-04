
function shortestToChar(input: string, pivot: string): number[] {
    this.shortestDistanceToPivot = new Array<number>(input.length).fill(input.length);

    fillShortestDistanceToPivot(0, input, pivot);
    fillShortestDistanceToPivot(input.length - 1, input, pivot);
    return this.shortestDistanceToPivot;
};

function fillShortestDistanceToPivot(startIndex: number, input: string, pivot: string): void {
    let end = (startIndex === 0) ? input.length : -1;
    let step = (startIndex === 0) ? 1 : -1;
    let distance = input.length;

    for (let i = startIndex; i !== end; i += step) {
        distance = (input.charAt(i) === pivot) ? 0 : distance + 1;
        this.shortestDistanceToPivot[i] = Math.min(distance, this.shortestDistanceToPivot[i]);
    }
}
