import java.util.Scanner;

public class Array {

    public void productOf3MaximumElement(int[] arr) {

        for (int j = 0; j < 5; j++) {
            // max = nums[0];
            for (int i = j + 1; i < 5; i++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(arr[0] * arr[1] * arr[2]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the " + i + "number");
            nums[i] = sc.nextInt();
        }
        Array ar = new Array();
        ar.productOf3MaximumElement(nums);
        sc.close();
    }

}
