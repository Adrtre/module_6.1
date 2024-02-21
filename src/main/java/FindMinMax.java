public class FindMinMax {

    public static void main(String[] args) {
        int[] numbers = {3, 1, 5, 6, 7, 9, 15, 3, 4, 7, 10};

        int min = findMinimum(numbers);
        int max = findMaximum(numbers);

        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
    }
    public static int findMinimum(int[] numbers) {

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static int findMaximum(int[] numbers) {

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

}
