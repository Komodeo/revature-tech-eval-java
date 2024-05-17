// Example final method

package keywords.finalmethod;

class Bike {
    final void run() {
        System.out.println("running");
    }
}

class Honda extends Bike {
    // void run() {
    //     System.out.println("running safely with 100kmph");
    // } // Compile Time Error (Cant override final method)

    public static void main(String args[]) {
        Honda honda = new Honda();
        honda.run();
    }
}