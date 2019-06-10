import java.lang.annotation.Repeatable;
import java.util.*;

public class BasicJava {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("\r\n\r\nBasic 13 in Java\r\n\r\n");
        pressEnterToContinue();
        print1To255();
        pressEnterToContinue();
        printOdd1To255();
        pressEnterToContinue();
        printSum();
        pressEnterToContinue();
        iterateArray(getRandomIntArray());
        pressEnterToContinue();
        findMax(getRandomIntArray());
        pressEnterToContinue();
        getAverage(getRandomIntArray());
        pressEnterToContinue();
        getOddArray(255);
        pressEnterToContinue();
        greaterThanY(getRandomIntArray(), new Random().nextInt(42));
        pressEnterToContinue();
        squareArray(getRandomIntArray());
        pressEnterToContinue();
        eliminateNegs(getRandomIntArray());
        pressEnterToContinue();
        maxMinAvg(getRandomIntArray());
        pressEnterToContinue();
        shiftArray(getRandomIntArray());
        pressEnterToContinue();

        scanner.close();
    }

    private static int[] getRandomIntArray() {
        Random random = new Random();
        int[] arr = random.ints(10, 0, 100).toArray();
        for (int i = 0; i < arr.length; i++) {
            if (random.nextBoolean())
                arr[i] -= (arr[i] * 2);
        }
        return arr;
    }

    private static void pressEnterToContinue() {
        System.out.println("\r\nPress <ENTER> to continue...");
        scanner.nextLine();
    }

    public static void print1To255() {
        // Write a method that prints all the numbers from 1 to 255.

        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    public static void printOdd1To255() {
        // Write a method that prints all the odd numbers from 1 to 255.

        for (int i = 1; i < 256; i += 2) {
            System.out.println(i);
        }
    }

    public static void printSum() {
        // Write a method that prints the numbers from 0 to 255, but this time print the
        // sum of the numbers that have been printed so far. For example, your output
        // should be something like this:

        // New number: 0 Sum: 0
        // New number: 1 Sum: 1
        // New number: 2 Sum: 3
        // New number: 3 Sum: 6
        // ...
        // New number: 255 Sum: ___
        // Do NOT use an array to do this exercise.

        int sum = 0;
        for (int i = 0; i < 256; i++) {
            sum += i;
            System.out.println(String.format("New number: %d   Sum: %d", i, sum));
        }

    }

    public static void iterateArray(int[] arr) {
        // Given an array X, say [1,3,5,7,9,13], write a method that would iterate
        // through each member of the array and print each value on the screen. Being
        // able to loop through each member of the array is extremely important.

        System.out.println(Arrays.toString(arr) + "\r\n");
        for (int i = 1; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void findMax(int[] arr) {
        // Write a method (sets of instructions) that takes any array and prints the
        // maximum value in the array. Your method should also work with a given array
        // that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive
        // numbers, negative numbers and zero.

        System.out.println(Arrays.toString(arr) + "\r\n");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(String.format("Max: %d", max));
    }

    public static void getAverage(int[] arr) {
        // Write a method that takes an array, and prints the AVERAGE of the values in
        // the array.
        // For example for an array [2, 10, 3], your method should print an average of
        // 5. Again,
        // make sure you come up with a simple base case and write instructions to solve
        // that base
        // case first, then test your instructions for other complicated cases.

        System.out.println(Arrays.toString(arr) + "\r\n");
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(String.format("Average: %d", sum / arr.length));
    }

    public static void getOddArray(int length) {
        // Write a method that creates an array 'y' that contains all the odd numbers
        // between 1 to 255. When the method is done, 'y' should have the value of
        // [1, 3, 5, 7, ... 255].

        int loops = (length % 2 == 0) ? length : length + 1;
        int[] y = new int[loops / 2];
        int index = 0;
        for (int i = 1; i < loops; i += 2) {
            y[index++] = i;
        }
        System.out.println(String.format("Odd array from 1 to %d:\r\n%s", length, Arrays.toString(y)));
    }

    public static void greaterThanY(int[] arr, int Y) {

        // Write a method that takes an array and returns the number of values in that
        // array whose value is greater than a given value y. For example, if array =
        // [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there
        // are two values in the array that are greater than 3).

        System.out.println(String.format("Array:\r\n%s\r\nY value: %d", Arrays.toString(arr), Y));
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Y)
                ++total;
        }
        System.out.println(String.format("There are %d values larger than Y (%d).", total, Y));
    }

    public static void squareArray(int[] arr) {
        // Given any array x, say [1, 5, 10, -2], write a method that multiplies each
        // value in the array
        // by itself. When the method is done, the array x should have values that have
        // been squared, say
        // [1, 25, 100, 4].

        System.out.println(String.format("Array:\r\n%s", Arrays.toString(arr)));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(String.format("Squared Array:\r\n%s", Arrays.toString(arr)));
    }

    public static void eliminateNegs(int[] arr) {
        // Given any array x, say [1, 5, 10, -2], write a method that replaces any
        // negative number with
        // the value of 0. When the method is done, x should have no negative values,
        // say [1, 5, 10, 0].

        System.out.println(String.format("Array:\r\n%s", Arrays.toString(arr)));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                arr[i] = 0;
        }
        System.out.println(String.format("\r\nNew array:\r\n%s", Arrays.toString(arr)));
    }

    public static void maxMinAvg(int[] arr) {
        // Given any array x, say [1, 5, 10, -2], write a method that returns an array
        // with the maximum
        // number in the array, the minimum value in the array, and the average of the
        // values in the
        // array. The returned array should be three elements long and contain: [MAXNUM,
        // MINNUM, AVG]

        System.out.println(String.format("Array:\r\n%s", Arrays.toString(arr)));
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
            sum += arr[i];
        }
        System.out.println(String.format("Max: %d\r\nMin: %d\r\nAvg: %d", max, min, sum / arr.length));
    }

    public static void shiftArray(int[] arr) {
        // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each
        // number by one to
        // the front. For example, when the method is done, an x of [1, 5, 10, 7, -2]
        // should become
        // [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need
        // to wrap around
        // the values shifted out of bounds.

        System.out.println(String.format("Array:\r\n%s", Arrays.toString(arr)));
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = 0;
        System.out.println(String.format("New array:\r\n%s", Arrays.toString(arr)));
    }
}