package Lession_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_6 {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[SetArraySize()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30);
        }
        System.out.print("First Array:");
        PrintArray(arr);
        List<Integer> list = Arrays.stream(arr).filter(x -> x % 2 == 0 && x > 2 && x <= 20 && x > 10).sorted().boxed().collect(Collectors.toList());
        System.out.print("Filtered List:");
        list.forEach(x -> System.out.print(" " + x));
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

