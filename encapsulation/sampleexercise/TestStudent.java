/* Sample Exercise
Create an encapsulated class with 4 fields and the respective methods to access and edit those fields. Then go ahead and create a test class to verify. 

Class Name : Student
Field Names : studentId, studentName, collegeName, address
Test Class Name : TestStudent */

package encapsulation.sampleexercise;

public class TestStudent {
    public static void main(String[] args) {
        // creating instance of the encapsulated class
        Student s = new Student();
        // setting value of the student ID
        s.setId("1337");
        // getting value of the student ID
        System.out.println(s.getId());
        
        // setting value of the student name
        s.setStudentName("Joseph Bologna");
        // getting value of the student name
        System.out.println(s.getStudentName());
        
        // setting value of the college name
        s.setCollegeName("Drag University");
        // getting value of the college name
        System.out.println(s.getCollegeName());
        
        // setting value of the address
        s.setAddress("123 Fake Street");
        // getting value of the address
        System.out.println(s.getAddress());
    }
}
