// Example finally block

package exceptions;

public class ExcepTest2 {

    public static void main(String args[]) {
        int a[] = new int[2]; // Size 2
        try {
            System.out.println("Access element three :" + a[3]); // Accessing 3rd element
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally { // Always executed no matter what!
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
/*
 * Output :
 * Exception thrown :java.lang.ArrayIndexOutOfBoundsException: 3
 * First element value: 6
 * The finally statement is executed
 */