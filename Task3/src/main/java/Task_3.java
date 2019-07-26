import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, c;
        System.out.println("Enter value of x");
        x = scanner.nextDouble();
        System.out.println("Enter value of y");
        y = scanner.nextDouble();
        c = (Math.sin(x)+Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.printf("The Result is = %.2f", c);
        scanner.close();

    }
}
