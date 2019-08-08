<<<<<<< HEAD
import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start line A");
        int a = scanner.nextInt();
        System.out.println("Enter finish line B");
        int b = scanner.nextInt();
        System.out.println("Enter step h");
        double h = scanner.nextDouble();
        System.out.println("Enter the value of x");
        int x = scanner.nextInt();
        int  y;

        for (double i = a; i <= b; i = i + h) {
            if (x > 2) {
                y = x;
            } else
              y = -x;
           System.out.println("x = "+ x + "\n" + "y = " + y);
        }
=======
public class Task_13 {
    public static void main(String[] args) {

      //  2. Вычислить значения функции на отрезке [а,b] c шагом h:



        // Не понял условие








>>>>>>> Task_14
    }
}
