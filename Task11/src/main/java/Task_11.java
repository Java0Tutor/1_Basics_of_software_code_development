import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        //Вычислить значение функции:
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter x ");
        double x = scanner.nextDouble();

        double g, z;
        if (x<=3){
            z = Math.pow(x,2)-3*x+9;
            System.out.printf("Result 1: %.1f ", z);
        } else if (x > 3) {
            g = 1 / (Math.pow(x, 3) + 6);
            System.out.printf("Result 2: %.1f ", g);
        }
    }
}
