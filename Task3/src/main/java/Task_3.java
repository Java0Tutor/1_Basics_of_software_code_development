import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
<<<<<<< HEAD
      //  3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):


        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            double a, b, c;
            System.out.println("Enter value of a");
            a = scanner.nextDouble();
            System.out.println("Enter value of b");
            b = scanner.nextDouble();
            System.out.println("Enter value of c");
            c = scanner.nextDouble();

            double z = ((a - 3) * b / 2) + c;
            System.out.println("The Result is = " + z);
            scanner.close();
        }


    }


=======
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
>>>>>>> Task_3
}
