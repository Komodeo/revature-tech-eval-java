/* Sample Exercise : 
To create an abstract class called Bank.
To create an abstract method called getRateOfInterest();
To create two subclasses called SBI - 7% and PNB - 5% as two banks that extend the abstract class Bank.
To implement different functionalities for the getRateOfInterest() method in the SBI and PNB classes through the concept of method overriding and print out the interest rate inside the main() method created separately in a test class called TestBank */

package abstraction.sampleexercise;

abstract class Bank { // Abstract class
    static float getRateOfInterest() {
        return 10f;
    } // Abstract method
}

class SBI extends Bank {
    static float getRateOfInterest() {
        return 7f;
    }
}

class PNB extends Bank {
    static float getRateOfInterest() {
        return 5f;
    }
}