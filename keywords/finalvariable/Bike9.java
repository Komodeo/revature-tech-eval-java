// Example final variable

package keywords.finalvariable;

class Bike9 {
    final int speedlimit = 90;// final variable

    void run() {
        //speedlimit = 400; // Compile Time Error (Cant change final variable value)
    }

    public static void main(String args[]) {
        Bike9 obj = new Bike9();
        obj.run();
    }
}// end of class