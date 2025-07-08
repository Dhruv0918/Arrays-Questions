import java.util.Scanner;

public class Ques1 {

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
    }
}