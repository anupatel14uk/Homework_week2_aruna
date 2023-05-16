package Homework_week2_aruna;
/**Write a Java programme using the following steps.
 *Declare one instance and one static variable.
 * Declare one instance method.
 * Declare one static method.
 *Call both instance and static variables into both instance and static methods inside the print statement.
 *Declare the Main method.
 *Call both instance and static methods into the Main method and run the programme
 */

public class JavaProgram3 {
    static int b = 10;
    int a = 5;

    public static void main(String[] args) {
        JavaProgram3 p = new JavaProgram3();
        p.method1();
        JavaProgram3.method2();
    }
    public void method1() {//instance
        System.out.println("a=" + a);
    }
    public static void method2() {
        System.out.println("b=" + b);
    }

}


