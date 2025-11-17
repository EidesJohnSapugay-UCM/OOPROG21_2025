public class CountElements {
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};

        int count = countGreaterThanPreviousAverage(responseTimes);

        System.out.println("Count = " + count);
    }

    public static int countGreaterThanPreviousAverage(int[] arr) {
        int count = 0;
        double sum = 0;

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i - 1];        // add previous element
            double avg = sum / i;     // compute average of previous elements

            if (arr[i] > avg) {
                count++;
            }
        }

        return count;
    }
}
