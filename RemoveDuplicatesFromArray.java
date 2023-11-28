import java.util.Scanner;
public class RemoveDuplicateInArrayExample {
    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        length = removeDuplicateElements(arr, length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
        scanner.close();
    }
}
