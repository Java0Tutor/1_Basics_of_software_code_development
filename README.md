# Basics of software code development

Описание файлов:

 - Practice (tasks).pdf - файл содержит список задач, которые нужно решить для завершения этапа.
 - Questions.pdf - файл содержит вопросы, на которые нужно уметь отвечать по завершению этапа.
 - Recommendations.pdf - файл содержит рекомендуемые материалы (видео и книги), к которым следует обратиться при возникновении трудностей при решении задач или ответах на вопросы.
 
 ```java
 import java.util.Scanner;
    //1. Найдите значение функции: z = ((a – 3 )*b/2) + c.
 public class Task_1 {
        public static void main(String[] args) {
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
```
___________________________________________________________________________________________________________________
```java
import java.util.Scanner;
    
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, z;
        System.out.println("Enter value of a");
        a = scanner.nextDouble();
        System.out.println("Enter value of b");
        b = scanner.nextDouble();
        System.out.println("Enter value of c");
        c = scanner.nextDouble();
        z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2*a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.printf("The Result is = %.2f", z);
        scanner.close();
    }
}
```
_______________________________________________________________________________________________________________________
```java

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
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
```
__________________________________________________________________________________________________________________________
```java
  
import java.util.Scanner;
         //  4.   Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
        //        Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class Task_4 {
    public static void main(String[] args) {
      
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
```
___________________________________________________________________________________________________________________________
```java
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
```
_________________________________________________________________________________________________________________________
```java
import java.util.Scanner;
        //  Таск 6: Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        //  принадлежит закрашенной области, и false — в противном случае:
public class Task_6 {
    public static void main(String[] args) {

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
```
____________________________________________________________________________________________________________________________
```java
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        //  1. Даны два угла треугольника (в градусах).
        //  Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
        final int SUM_OF_ANGLE_TRIANGLE = 180;
        int z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the angle one");
        int x = scanner.nextInt();
        System.out.println("Enter the angle two");
        int y = scanner.nextInt();
        z = Math.abs(SUM_OF_ANGLE_TRIANGLE - (x + y)); // Math.abs() - всегда даёт положительный результат (меняет минус на плюс)
        System.out.println(z);

        if (z == 90 || x == 90 || y == 90) {
            System.out.println("This is triangle and its right triangle");
        } else if (SUM_OF_ANGLE_TRIANGLE == z + x + y){
            System.out.println("This is triangle");
        } else {
            System.out.println("This is not triangle");
        }
    }
}
```
________________________________________________________________________________________________________________________

```java
import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        // 2. Найти max{min(a, b), min(c, d)}
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        System.out.println("Enter c");
        int c = scanner.nextInt();
        System.out.println("Enter d");
        int d = scanner.nextInt();
        int z = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("Test -> " + z);

        int f , h ;
        if (a >= b) {
            f = b;
        }else f = a;
        if (c >= d) {
            h = d;
        }else h = c;
        if (f >= h) {
            System.out.println("The value of max{min(a, b), min(c, d)} is " + f);
        }else System.out.println("The value of max{min(a, b), min(c, d)} is " + h);

         scanner.close();
        }
    }
    ```
    ____________________________________________________________________________________________________________________
    ```java
    import java.util.Scanner;
        //  3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
        //   Определить, будут ли они расположены на одной прямой.
public class Task_9 {
    public static void main(String[] args) {
        
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
}
```
__________________________________________________________________________________________________________________________
```java
import java.util.Scanner;
        //  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
        // Определить, пройдет ли кирпич через отверстие.
public class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a side of hole A:");
        int a = scanner.nextInt();
        System.out.println("Enter a side of hole B:" );
        int b = scanner.nextInt();

        System.out.println("Enter a side of brick x:" );
        int x = scanner.nextInt();
        System.out.println("Enter a side of brick y:" );
        int y = scanner.nextInt();
        System.out.println("Enter a side of brick z:" );
        int z = scanner.nextInt();

        if (a >= y && b >= x || a >= x && b >= y)
            System.out.println("The brick is passed ");
        else
            System.out.println("The brick is not passed ");

        scanner.close();
    }
}
```
______________________________________________________________________________________________________________________
```java
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
```
________________________________________________________________________________________________________________________
```java
import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

        //   1. Напишите программу, где пользователь вводит любое целое положительное число.
        //   А программа суммирует все числа от 1 до введенного пользователем числа.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = scanner.nextInt();
        int  z = 0;
        for (int i = 1; i <= x; i++){
            z+=i;
        }
        System.out.println("Sum of numbers from one is " + z);
    }
}
```
________________________________________________________________________________________________________________________
```java
import java.util.Scanner;

      //  2. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start line A");
        int a = scanner.nextInt();
        System.out.println("Enter finish line B");
        int b = scanner.nextInt();
        System.out.println("Enter step h");
        double h = scanner.nextDouble();
        System.out.println("Enter the value of x");
        int x = scanner.nextInt();
        int  y;

        for (double i = a; i <= b; i = i + h) {
            if (x > 2) {
                y = x;
            } else
                y = -x;
            System.out.println("x = "+ x + "\n" + "y = " + y);
        }
    }
}
```
________________________________________________________________________________________________________________________
```java
public class Task_14 {
    public static void main(String[] args) {

       // 3. Найти сумму квадратов первых ста чисел.
        int s=0;
        for (int i = 1; i <= 100; i++ ){
            s+=i*i;
            System.out.println(s);
        }
        System.out.println("Sum is " + s);
    }
}
```
_______________________________________________________________________________________________________________________
```java

public class Task_15 {
    public static void main(String[] args) {

       // 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
        long s = 1 ;
        for (int i = 1; i <= 200; i++) { //После 33 вышло за пределы диапазона 10 раз и выдало 0 (слишком большое число)
            s =s*(i*i);
        System.out.println("s " + s);
        }
        System.out.println("Sum is " + s);
    }
 }
 ```
 _______________________________________________________________________________________________________________________
 ```java
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
```
_________________________________________________________________________________________________________________________
```java
public class Task_17 {
    public static void main(String[] args) {

         // Циклы
        //  Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

        char charsSigns  = '\u0000';
        int charsNumber = 0;
        for (int i = 0; i<= 10000; i++){
            charsSigns++;
            charsNumber++;
            System.out.println("sign: " + charsSigns + "  number: " + charsNumber);
        }
    }
}
```
_______________________________________________________________________________________________________________________
```java

import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {

        //   rus: Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
        //        m и n вводятся с клавиатуры.

        //  eng: For each positive integer in the range from m to n, print all dividers except for the unit and the number itself.
        //       m and n are entered from the keyboard.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start of line numbers m ");
        int m = scanner.nextInt();
        System.out.println("Enter end of line numbers n ");
        int n = scanner.nextInt();

        while (m <= n) {
            System.out.print("\n number: " + m);
            System.out.print(" its dividers: ");
            for (int i = 2; i <= m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + ",");
                }
            }
            m = m + 1;
        }
    }
}
```
________________________________________________________________________________________________________________________
```java
import java.util.Scanner;

public class Task_19 {

    public static void main(String[] args) {

        // 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        String a = scanner.nextLine();
        System.out.println("Enter number b: ");
        String b = scanner.nextLine();

        for (int f = 0; f < a.length(); f++) {
            a.charAt(f);
        }
        System.out.println(" ");
        for (int g = 0; g < b.length(); g++) {
            b.charAt(g);
        }
        System.out.println("\n The same numbers from two lines is: ");
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print("|" + b.charAt(j));
              }
             }
            }
          }
       }
       ```
       _______________________________________________________________________________________________________________
