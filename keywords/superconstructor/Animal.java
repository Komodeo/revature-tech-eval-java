// Using "super" to invoke parent class constructor

package keywords.superconstructor;

class Animal {
    Animal() {
        System.out.println("animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // using super keyword to access the parent class constructor.
        System.out.println("dog is created");
    }
}

class TestSuper3 {
    public static void main(String args[]) {
        Dog d = new Dog();
    }
}