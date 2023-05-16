package Homework_week2_aruna;
/**Write a program for a calculator with addition, subtraction,
 * multiplication and division methods all with parameters and
 * use string concatenation methods
 * .(Note: Two static and Two instance methods.)
 */

public class JavaProgram5 {

    public static void main(String[] args) {
        int first = 20;
        int second = 5;
        JavaProgram5 javaProgram5 = new JavaProgram5();
        javaProgram5.addition(first,second);
        javaProgram5.subtraction(first,second);

        JavaProgram5.multiplication(first,second);
        JavaProgram5.division(first,second);

    }

    public void addition(int a, int b) {//instance
        System.out.println("addition of a+b(" + a + "+" + b + ")=" + (a + b));
    }

    public void subtraction(int a, int b) {//instance
        System.out.println("subtraction of a-b(" + a + "-" + b + ")=" + (a - b));
    }

    public static void multiplication(int a, int b) {//static
        System.out.println("multiplication of a*b(" + a + "*" + b + ")=" + (a * b));
    }

    public static void division(int a, int b) {//static
        System.out.println("division  of a/b(" + a + "/" + b + ")=" + (a / b));
    }

}

