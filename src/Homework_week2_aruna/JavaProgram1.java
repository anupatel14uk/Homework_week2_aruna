package Homework_week2_aruna;
/**  Write a Java programme using the following steps.
 1.1 Declare two instance variables.
 1.2 Declare one instance method.
 1.3 Call both instance variables into the instance method inside the print statement.
 1.4 Declare the Main method.
 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class JavaProgram1 {
    //instance variable
    int a = 5;
    int b = 10;
    public static void main(String[] args) {
        JavaProgram1 p = new JavaProgram1();
        p.method1();
    }
    public void method1(){
        System.out.println("a="+a+",b="+b);
    }

}