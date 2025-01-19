//********************************************************************
// Student.java Author: Lewis/Loftus
//
// Represents a college student.
//********************************************************************
public class Student {

    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private int[] testGrades = new int[3];

    //-----------------------------------------------------------------
    // Constructor: Sets up this student with the specified values.
    //-----------------------------------------------------------------
    public Student (String firstName, String lastName, Address homeAddress, Address schoolAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }

    //-----------------------------------------------------------------
    // Sets a score to a student's specific test (1 to 3).
    //-----------------------------------------------------------------
    public void setTestScore(int pos, int value) {
        this.testGrades[pos-1] = value;
    }

    //-----------------------------------------------------------------
    // Returns the score of a student's specific test (1 to 3).
    //-----------------------------------------------------------------
    public int getTestScore(int pos) {
        return this.testGrades[pos-1];
    }

    //-----------------------------------------------------------------
    // Returns the average of all 3 of the student's tests.
    //-----------------------------------------------------------------
    public int average() {
        return ((this.testGrades[0] + this.testGrades[1] + this.testGrades[2]) / 3);
    }

    //-----------------------------------------------------------------
    // Returns a string description of this Student object.
    //-----------------------------------------------------------------
    public String toString() {
        return ("First name: " + this.firstName + "\nLast name: " 
                + this.lastName + "\nHome Address: " + this.homeAddress.toString() + "\nSchool Address: " 
                + this.schoolAddress.toString() + "\nTest average: " + average());
    }
}