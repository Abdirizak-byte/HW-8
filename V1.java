public class V1 {
    // returns the range of values in the given array;
    // the difference between elements furthest apart
    // example: range({17, 29, 11, 4, 20, 8}) is 25
    public static int range(int[] numbers) {
        int maxDiff = 0;     // look at each pair of values
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int diff = Math.abs(numbers[j] – numbers[i]);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        return diff;
    }
}
