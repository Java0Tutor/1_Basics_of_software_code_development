import java.util.Scanner;

public class Task_16 {

    public static void main(String[] args) {

       // Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
       // заданному е. Общий член ряда имеет вид:   a =  1/2^n + 1/3^n;

        System.out.println("Input е");
        Scanner scanner = new Scanner(System.in);
        double e =  scanner.nextDouble();

        int n = 0;
        double sum = 0;
        System.out.println("Print a series of common member series: ");
        for (int i = 0; i<=10; i++){
           ++n;
           System.out.print("\n");
           double a =  (1/Math.pow(2,n))+ (1/Math.pow(3,n));
           System.out.printf("%.4f", a);
            if (e <= Math.abs(a))
            sum = sum+a;
        System.out.printf(" sum is %f", sum);

        }
    }
}
