// "this" : to invoke current class constructor

package keywords.thisconstructor;

class A {
    A() {
        System.out.println("hello a");
    }

    A(int x) {
        this(); // Current class constructor is called.
        System.out.println(x);
    }
}

class TestThis5 {
    public static void main(String args[]) {
        A a = new A(10);
    }
}