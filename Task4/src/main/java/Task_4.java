import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
         //  4.   Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
        //        Поменять местами дробную и целую части числа и вывести полученное значение числа.
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three-digit number with a three-digit fractional part: ");
        str = scanner.nextLine();
        String [] rep = str.split("\\.");  // Забыл экранировать, аааа блядь
        String swap = rep[1];
        rep[1] = rep[0];
        rep[0] = swap;
        System.out.println(rep[0] + "." + rep[1]);
    }
}
