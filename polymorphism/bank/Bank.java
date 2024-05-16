/* Sample Exercise
 Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However, the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest. */

package polymorphism.bank;

public class Bank {
    // Overridden method
    public static float getRateOfInterest() {
        return 10f;
    }
}

class SBI extends Bank {
    // Overriding method
    public static float getRateOfInterest() {
        return 8f;
    }
}

class ICICI extends Bank {
    // Overriding method
    public static float getRateOfInterest() {
        return 7f;
    }
}

class AXIS extends Bank {
    // Overriding method
    public static float getRateOfInterest() {
        return 9f;
    }
}

class Main {
    public static void main(String[] args)
    {
        System.out.println(Bank.getRateOfInterest());
        System.out.println(SBI.getRateOfInterest());
        System.out.println(ICICI.getRateOfInterest());
        System.out.println(AXIS.getRateOfInterest());
    }
}