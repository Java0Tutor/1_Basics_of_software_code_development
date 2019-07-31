
package by.learn;

class Granny {}
class Father extends Granny {}
class Son extends Father {}

class Uncle extends Granny {}

public class InstanceOfChecker {

     // instanceof  это с учетом наследования

    public static void doAction(Granny c) {
// Оператор instanceof срабатывает по значеню объекта а не по типу
        if (c instanceof Father) {/*BaseCourse and FreeCourse */
            System.out.println("for Father and Son");
        } else if (c instanceof Uncle) {/*for OptionalCourse*/
            System.out.println("for Uncle");
        } else {/* for Course or null */
            System.out.println("for Granny or null");
        }
    }

    public static void main(String[] args) {
        //Father gen = new Father();
        //Son gen = new Son();
        Granny gen = new Son();
       doAction(gen);
    }

}
