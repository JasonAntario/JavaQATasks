package Lession_1;

public class Task_3 {
    public static void main(String[] args) {
        System.out.print("All even numbers > 10:");
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0 && i > 10)
                System.out.print(" " + i);
        }
    }
}
