package by.learn;

public class Logical {
    public static void main(String[] args) {
       int x = 1;
       int y = 1;
        boolean a1 = x == y; // true
        boolean b1 = x != y; // false
        System.out.println(x++ == y++ && x++ != y++);  // выполнит только 1 сравнение
        System.out.println("x= " + x + ", y "+ y);

        boolean a2 = x == y; // true
        boolean b2 = x != y; // false
        System.out.println(x++ != y++ && x++ == y++);// выполнит 1 и 2 сравнение
        System.out.println("x= " + x + ", y "+ y);

        boolean a3 = x == y; // true
        boolean b3 = x != y; // false
        System.out.println(x++ != y++ || x++ == y++);  // выполнит 1 и 2
        System.out.println("x= " + x + ", y "+ y);

        boolean a4 = x == y; // true
        boolean b4 = x != y; // false
        System.out.println(x++ == y++ || x++ != y++);// выполнит только 1
        System.out.println("x= " + x + ", y "+ y);


    }

}
