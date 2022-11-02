package Basics_of_software_code_development;

public class LenierPrograms {
    public static double task1(double a, double b, double c){
        return ((a - 3) * b / 2) + c;
    }

    public static double task2(double a, double b, double c) {
        return ((b+(Math.sqrt(Math.pow(b,2)+4*a*c))) / (2*a)) - Math.pow(a,3)*c + Math.pow(b, -2);
    }

    public static double task3(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
    }

    public static double task4(double x){
        return (x * 1000) % 1000 + (int)x/1000.;
    }
    public static void task5(int t){
        double timeInHours = t/3600.;
        int hours = (int)(timeInHours);
        double timeInMinutes = (timeInHours-hours)*60;
        int min = (int)(timeInMinutes);
        double timeInSec = (timeInMinutes-min)*60;
        int sec = (int) Math.round(timeInSec);
        System.out.println("HH" + hours + " MM" + min + " SS" + sec);
    }

    public static boolean task6(int x, int y){
        if (y>=-3 && y<=4){
            if (y<=0) {return x >= -4 && x <= 4;}
            else {return x >= -2 && x <= 2;}
        }
        else {return false;}
    }
}
