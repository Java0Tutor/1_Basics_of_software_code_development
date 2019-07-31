import java.util.Scanner;

public class Task_19 {

    public static void main(String[] args) {

        // 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        String a = scanner.nextLine();
        System.out.println("Enter number b: ");
        String b = scanner.nextLine();

        for (int f = 0; f < a.length(); f++) {
            a.charAt(f);
        }
        System.out.println(" ");
        for (int g = 0; g < b.length(); g++) {
            b.charAt(g);
        }
        System.out.println("\n The same numbers from two lines is: ");
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print("|" + b.charAt(j));
              }
             }
            }
          }
       }
