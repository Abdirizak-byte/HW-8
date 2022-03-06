public class V3 {
    // returns the range of values in the given array;
    // example: range({17, 29, 11, 4, 20, 8}) is 25
    public static int range(int[] numbers) {
        int max = numbers[0];     // find max/min values
        int min = max;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max - min;
    }
}
