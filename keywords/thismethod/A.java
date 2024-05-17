// "this" : to invoke current class method

package keywords.thismethod;

class A {
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        // m();//same as this.m()
        this.m(); // By default added by the compiler
    }
}

class TestThis4 {
    public static void main(String args[]) {
        A a = new A();
        a.n();
    }
}