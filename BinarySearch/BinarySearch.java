package BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] seriesOfRandomNumber = {1, 3, 5, 53, 2, 7, 8, 12, 32, 43, 75, 34, 53, 65, 33, 17, 39, 29, 16, 55, 22, 21, 25, 27, 37, 64, 99};
        int result = binarySearch(seriesOfRandomNumber, 9);
        System.out.println("Index of the wanted number: " + result);
    }

    private static int binarySearch(int[] numbers, int wantedNum) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int middleIndex = (right + left) / 2;
            int middleNumber = numbers[middleIndex];
            System.out.println();
            System.out.println("The middle Index for this Array is : " + middleIndex + " associated with the number : " + middleNumber);
            if (wantedNum == middleNumber) {
                return middleIndex;
            } else if (wantedNum < middleNumber) {
                right = middleIndex - 1;
            } else if (wantedNum > middleNumber) {
                left = middleIndex + 1;
            }
        }
        return -1;
    }
}

