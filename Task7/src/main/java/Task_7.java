import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        //  1. Даны два угла треугольника (в градусах).
        //  Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
        final int SUM_OF_ANGLE_TRIANGLE = 180;
        int z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the angle one");
        int x = scanner.nextInt();
        System.out.println("Enter the angle two");
        int y = scanner.nextInt();
        z = Math.abs(SUM_OF_ANGLE_TRIANGLE - (x + y)); // Math.abs() - всегда даёт положительный результат (меняет минус на плюс)
        System.out.println(z);

        if (z == 90 || x == 90 || y == 90) {
            System.out.println("This is triangle and its right triangle");
        } else if (SUM_OF_ANGLE_TRIANGLE == z + x + y){
            System.out.println("This is triangle");
        } else {
            System.out.println("This is not triangle");
        }
    }
}
