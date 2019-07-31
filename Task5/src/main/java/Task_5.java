import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        int  hours, minutes, seconds;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the natural number of seconds");
        int inputSecond =  scanner.nextInt();
        hours = inputSecond/3600;
        minutes = (inputSecond%3600)/60;
        seconds = ((inputSecond%3600))%60;
        System.out.printf("%02dч ",hours);
        System.out.printf("%02dмин ",minutes);
        System.out.printf("%02dс",seconds);
        scanner.close();
    }
}
