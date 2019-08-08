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

