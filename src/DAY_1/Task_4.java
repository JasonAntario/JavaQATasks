package DAY_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_4 {

    public static void main(String[] args) throws IOException {

        int[] arr = new int[SetArraySize()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.print("First Array:");
        PrintArray(arr);

        SwiftArrayElements(arr);
        System.out.print("Second Array:");
        PrintArray(arr);
    }

    public static void SwiftArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
    }

    public static int SetArraySize() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        return Integer.parseInt(reader.readLine());
    }

    public static void PrintArray(int[] arr) {
        for (int x : arr) {
            System.out.print(" " + x);
        }
        System.out.println();
    }
}
