package Homework_week2_aruna;

/**Write a Java programme using the following steps.
 *Declare two instance and two static variables.
 * Declare one instance method.
 *Declare one static method.
 *Call all four instance and static variables into both instance and static methods inside the print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */
public class JavaProgram4 {
    int a=10;
    int b=20;
    static int c=30;
    static int d=40;

    public static void main(String[] args) {
        JavaProgram4 p = new JavaProgram4();
        p.method1();
        JavaProgram4.method2(p);
    }
        public void method1() {//instance

        System.out.println("a=" + a + ",b=" + b + ",c" + c + ",d" + d);
        }
        public static void method2(JavaProgram4 p) {
            System.out.println("a=" + p.a + ",b=" + p.b + ",c" + c + ",d" + d);

        }


    }

