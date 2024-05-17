// "this" : to refer current class instance variable

package keywords.this_;

class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno; // Refers class instance variable rollno
        this.name = name; // Refers class instance variable name
        this.fee = fee; // Refers class instance variable fee
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

class TestThis2 {
    public static void main(String args[]) {
        Student s1 = new Student(111, "ankit", 5000f);
        Student s2 = new Student(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}