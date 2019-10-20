package by.learn;

public class OperatorsEqualityAndRelational {
    public static void main(String[] args) {

        // УРОК
         // Вот такой прикол, что числа имеющее семь 0 после запятой будут одинаковые
        // так как здесь имеется ограничение. Числа в периоде в математики и информатике не
        // одно и тоже до определенного значения

                // МАШИННЫЙ 0  Помнить о нем следует всегда
                // Вот почему не используем float или double для подсчёта денег

        float result  = 1 / 3.0f * 3;

        System.out.println(1.f == result); // true

        System.out.println(1.0000000146568481f == 1.000000051546f); // true


    }


}
