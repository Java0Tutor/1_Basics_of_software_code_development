import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

        //   1. Напишите программу, где пользователь вводит любое целое положительное число.
        //   А программа суммирует все числа от 1 до введенного пользователем числа.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = scanner.nextInt();
        int  z = 0;
        for (int i = 1; i <= x; i++){
            z+=i;
        }
        System.out.println("Sum of numbers from one is " + z);
    }
}
