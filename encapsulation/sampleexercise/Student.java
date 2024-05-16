/* Sample Exercise
Create an encapsulated class with 4 fields and the respective methods to access and edit those fields. Then go ahead and create a test class to verify. 

Class Name : Student
Field Names : studentId, studentName, collegeName, address
Test Class Name : TestStudent */

package encapsulation.sampleexercise;

public class Student {

    // STUDENT ID
    private String studentId;

    // getter method for ID
    public String getId() {
        return studentId;
    }

    // setter method for ID
    public void setId(String studentId) {
        this.studentId = studentId;
    }

    // STUDENT NAME
    private String studentName;

    // getter method for student name
    public String getStudentName() {
        return studentName;
    }

    // setter method for student name
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // COLLEGE NAME
    private String collegeName;

    // getter method for college name
    public String getCollegeName() {
        return collegeName;
    }

    // setter method for college name
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    // ADDRESS
    private String address;

    // getter method for address
    public String getAddress() {
        return address;
    }

    // setter method for address
    public void setAddress(String address) {
        this.address = address;
    }

}
