// Access Modifiers with Method Overriding

package encapsulation.accessmodifiers;

class A {
  void msg() { // removing protected keyword resolved below issue
    System.out.println("Hello java");
  }
}

public class Simple extends A {
  void msg() {
    System.out.println("Hello java");
  } // Error because Class Simple method msg() is more restrictive that Class A
    // method msg()

  public static void main(String args[]) {
    Simple obj = new Simple();
    obj.msg();
  }
}