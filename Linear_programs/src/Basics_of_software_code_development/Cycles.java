package Basics_of_software_code_development;

import java.math.BigInteger;
import java.util.Scanner;

public class Cycles {

    public static int task1(Scanner sc){
        System.out.println("Input positive int value: ");
        int number = sc.nextInt();
        int sum = 0;
        if (number>0){
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            return sum;
        }
        else {
            System.out.println("Incorrect input, must be positive value!");
            return 0;
        }
    }

    public static void task2(int a, int b, int h){
        int[] y = new int[b-a+1];
        int x;
        int i = 0;
        for (x = a; x<=b; x+=h, i++){
            if (x>2){
                y[i] = x;
            }
            else {
                y[i] = -x;
            }
        }
        for (int el:y) {
            System.out.print(el+" ");
        }
        System.out.println();
    }

    public static double task3(){
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static BigInteger task4(){
        BigInteger multi = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            multi = multi.multiply(BigInteger.valueOf(i*i));
        }
        return multi;
    }

    public static double task5(double e){
        double sum = 0;
        double n = 100;

        for (int i = 1; i < n; i++) {
            double a = (1 / (Math.pow(2, i))) + (1 / (Math.pow(3, i)));
            if (Math.abs(a) >= e) {
                sum += a;
                n++;
            }
        }
        return sum;
    }

    public static void task6(){
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + ": " + str.codePointAt(i));
        }
    }

    public static void task7(Scanner sc){
        System.out.println("Enter numbers in the range from m to n");
        System.out.println("Input m: ");
        int m = sc.nextInt();
        System.out.println("Input n: ");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.print("Number: " + i + " dividers: ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void task8(int a, int b){
        int[] array = new int[10];
        while (a != 0){
            array[a%10]++;
            a /= 10;
        }
        while (b!=0){
            array[b%10]++;
            b /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (array[i]!=0){
                System.out.print(i+" ");
            }
        }
    }
}
