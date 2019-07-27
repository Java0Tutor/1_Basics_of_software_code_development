import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        //  Таск 6: Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        //  принадлежит закрашенной области, и false — в противном случае:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();
        if (-4 <= x && x <= 4 && -3 <= y && y <= 0 ){
            System.out.println("The point into shape");
        }
        else if (-2 <=x && x <= 2 && 0 <= y && y <= 4  ){
            System.out.println("The point into shape");
        } else
            System.out.println("The point outer the shape");
    }
}
