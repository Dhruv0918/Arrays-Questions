// To check if an array is sorted or not.

public class Ques3 {
    static void isSorted(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                System.out.println("Array is not sorted.");
                return;
            }
        }
        System.out.println("Array is sorted.");
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 7, 6};
        isSorted(arr);
    }
}