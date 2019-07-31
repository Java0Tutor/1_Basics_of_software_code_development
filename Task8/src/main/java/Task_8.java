import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        // 2. Найти max{min(a, b), min(c, d)}
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        System.out.println("Enter c");
        int c = scanner.nextInt();
        System.out.println("Enter d");
        int d = scanner.nextInt();
        int z = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println("The value of max{min(a, b), min(c, d)} is " + z);
        scanner.close();
    }
}
