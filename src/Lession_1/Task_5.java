package Lession_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_5 {

public static int SHIFT_VALUE = 2;
    public static void main(String[] args) throws IOException {

        int[] arr = new int[SetArraySize()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.print("First Array:");
        PrintArray(arr);
        System.out.print("Second Array (after shifting):");
        PrintArray(SwiftArrayElements(arr));
    }

    public static int[] SwiftArrayElements(int[] arr) {
        int[] swiftArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i+SHIFT_VALUE>arr.length-1){
                swiftArr[i] = arr[i+SHIFT_VALUE-arr.length];
            }
            else {swiftArr[i] = arr[i+SHIFT_VALUE];}
        }
        return swiftArr;
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
