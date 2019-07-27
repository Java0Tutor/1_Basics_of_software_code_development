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
