/* Sample Exercise : 
To create an abstract class called Bank.
To create an abstract method called getRateOfInterest();
To create two subclasses called SBI - 7% and PNB - 5% as two banks that extend the abstract class Bank.
To implement different functionalities for the getRateOfInterest() method in the SBI and PNB classes through the concept of method overriding and print out the interest rate inside the main() method created separately in a test class called TestBank */

package abstraction.sampleexercise;

class TestBank {
    public static void main(String[] args)
    {
        System.out.println(Bank.getRateOfInterest());
        System.out.println(SBI.getRateOfInterest());
        System.out.println(PNB.getRateOfInterest());
    }
}
