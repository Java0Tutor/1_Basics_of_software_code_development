public class Task_17 {
    public static void main(String[] args) {

         // Циклы
        //6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

        char charsSigns  = '\u0000';
        int charsNumber = 0;
        for (int i = 0; i<= 10000; i++){
            charsSigns++;
            charsNumber++;
            System.out.println("sign: " + charsSigns + "  number: " + charsNumber);
        }
    }
}
