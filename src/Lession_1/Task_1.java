package Lession_1;

public class Task_1 {
    public static void main(String[] args) {
        int i = 1, j=1;
        System.out.println("i++: " + i++); //i++ сначала выведет i, затем сделает инкремент (ожидается 1)
        System.out.println("++j: " + ++j); //++j сначала сделает инкремент, потом выведет j (ожидается 2)
    }
}
