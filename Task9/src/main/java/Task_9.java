<<<<<<< HEAD
public class Task_9 {

    public static void main(String[] args) {

       // 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.




    }

=======
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        //  3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
        //   Определить, будут ли они расположены на одной прямой.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates dot A:");
        System.out.println("Enter x1 ");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1");
        int y1 = scanner.nextInt();

        System.out.println("Enter coordinates dot B:");
        System.out.println("Enter x2 ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2");
        int y2 = scanner.nextInt();

        System.out.println("Enter coordinates dot C:");
        System.out.println("Enter x3 ");
        int x3 = scanner.nextInt();
        System.out.println("Enter y3");
        int y3 = scanner.nextInt();

        if (x1==x2 && x1==x3)
            System.out.println("All dots is on one line");
        else if(y1==y2 && y1==y3){
            System.out.println("All dots is on one line");
        } else System.out.println("Dots don't is on one line");
    }
>>>>>>> Task_9
}
