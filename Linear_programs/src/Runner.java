import Basics_of_software_code_development.Branching;
import Basics_of_software_code_development.Cycles;
import Basics_of_software_code_development.LenierPrograms;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(LenierPrograms.task1(1, 2, 3));
        System.out.println(LenierPrograms.task2(1, 2, 3));
        System.out.println(LenierPrograms.task3(2, 1));
        System.out.println(LenierPrograms.task4(456.789));
        LenierPrograms.task5(5000);
        System.out.println(LenierPrograms.task6(0, -1));

        Branching.task1(5, 85);
        System.out.println(Branching.task2(15, 18, 25, 75));
        System.out.println(Branching.task3(-1,4,0,5,1,6));
        System.out.println(Branching.task4(10, 5, 5, 1, 15));
        System.out.println(Branching.task5(3));

        //System.out.println(Cycles.task1(sc));
        Cycles.task2(-5, 10, 1);
        System.out.println(Cycles.task3());
        System.out.println(Cycles.task4());
        System.out.println(Cycles.task5(0.2));
        Cycles.task6();
        //Cycles.task7(sc);
        Cycles.task8(123, 57779);
    }
}
