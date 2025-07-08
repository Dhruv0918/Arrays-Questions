//Second Largest Element in an Array without sorting
import java.util.Scanner;
import java.util.Arrays;

public class Ques2 {
    // Method to find the largest element
    public static int largestElement(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    //to find the second largest element
    public static int secondLargest(int[] nums, int max) {
        Integer secondMax = null; // Use Integer so we can check for null

        for (int num : nums) {
            if (num < max) {
                if (secondMax == null || num > secondMax) {
                    secondMax = num;
                }
            }
        }

        if (secondMax == null) {
            System.out.println("No second largest element found (all elements are equal).");
            return -1;
        }

        return secondMax;
    }

    // Method to construct the array
    public static int[] constructArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want in the array: ");
        int n = sc.nextInt();
        int[] num = new int[n];

        System.out.println("Input the numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        return num;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = constructArr();
        int largest = largestElement(arr);
        System.out.println("The largest element is: " + largest);
        int secLargest = secondLargest(arr, largest);
        System.out.println("The second largest element is: " + secLargest);
    }
}