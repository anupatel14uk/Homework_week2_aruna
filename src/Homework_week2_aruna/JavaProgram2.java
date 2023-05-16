package Homework_week2_aruna;
/**  Write a Java programme using the following steps.
* Declare two static variables
* Declare one static method
* Call both static variables into the static method inside the print statement.
* Declare the Main method.
* Call the static method into the Main method and Run the programme.
 */

public class JavaProgram2 {
    static int a = 15;
    static int b = 5;
    public static void main(String[] args) {
        JavaProgram2.method1();
    }
    public static void method1() {
        System.out.println("a=" + a + ",b=" + b);
    }
}



