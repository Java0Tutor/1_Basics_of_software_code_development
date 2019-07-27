
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        // 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
        // Определить, пройдет ли кирпич через отверстие.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a side of hole A:");
        int a = scanner.nextInt();
        System.out.println("Enter a side of hole B:" );
        int b = scanner.nextInt();

        System.out.println("Enter a side of brick x:" );
        int x = scanner.nextInt();
        System.out.println("Enter a side of brick y:" );
        int y = scanner.nextInt();
        System.out.println("Enter a side of brick z:" );
        int z = scanner.nextInt();

        if (a >= y && b >= x || a >= x && b >= y)
            System.out.println("The brick is passed ");
        else
            System.out.println("The brick is not passed ");

        scanner.close();
    }
}
