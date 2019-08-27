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


