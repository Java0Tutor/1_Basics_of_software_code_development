package Basics_of_software_code_development;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Branching {

    public static void task1(int a, int b){
        if (a>0 && b>0 && a+b<180){
            if(a==90 || b==90 || (a+b)==90){
                System.out.println("This is a right triangle");
            }
            else {
                System.out.println("This is a triangle");
            }
        }
        else {
            System.out.println("There is no such triangle");
        }
    }

    public static int task2(int a, int b, int c, int d){
        return Math.max(Math.min(a, b), Math.min(c, d));
    }

    public static boolean task3(int x1, int y1, int x2, int y2, int x3, int y3){
        return (x3-x1)/(x2-x1)==(y3-y1)/(y2-y1);
    }
    public static boolean task4(int a, int b, int x, int y, int z){
        int[] holeArr = {a, b};
        int[] brickArr = {x, y, z};
        Arrays.sort(holeArr);
        Arrays.sort(brickArr);
        return holeArr[0]>=brickArr[0] && holeArr[1]>=brickArr[1];
    }

    public static double task5(int x){
        return (x<=3)? Math.pow(x, 2) - 3 * x + 9: 1 / (Math.pow(x, 3) + 6);
    }
}
