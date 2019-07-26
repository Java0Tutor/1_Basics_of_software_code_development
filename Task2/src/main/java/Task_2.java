import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, z;
        System.out.println("Enter value of a");
        a = scanner.nextDouble();
        System.out.println("Enter value of b");
        b = scanner.nextDouble();
        System.out.println("Enter value of c");
        c = scanner.nextDouble();
        z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.printf("The Result is = %.2f", z);
        scanner.close();
    }
}

