package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
}
//2. Instantiate the Student class using yourself as the student. For the numberOfCredits give yourself 1 for this class and a GPA of 4.0 because you are a Java superstar!
//3.In the school package, create a class Course with at least three fields. Before diving into IntelliJ, try using pen and paper to work through what these might be. At least one of your fields should be an ArrayList or HashMap, and you should use your Student class.
//4.In the school package, create a class Teacher with four fields: firstName, lastName, subject, and yearsTeaching. Add getters and setters to the class and add the access level to each field and method in the class. When adding your getters and setters, think about what we read about in the section on Encapsulation.
//
//What access modifier restricts access the most for what we need?
//If it is a field, could we restrict the access to private and use getters and setters?
//If we do set fields to private, what access level do we have to give our getters and setters?