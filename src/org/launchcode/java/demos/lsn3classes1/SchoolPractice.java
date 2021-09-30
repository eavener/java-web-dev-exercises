package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student me = new Student ("Avener", 00001, 1, 4.0);
        // Instantiate your Student class for part 2 here!
    }
}

class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;
}
//3.In the school package, create a class Course with at least three fields. Before diving into IntelliJ, try using pen and paper to work through what these might be. At least one of your fields should be an ArrayList or HashMap, and you should use your Student class.

class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return getLastName();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    private void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

}

//4.In the school package, create a class Teacher with four fields: firstName, lastName, subject, and yearsTeaching. Add getters and setters to the class and add the access level to each field and method in the class. When adding your getters and setters, think about what we read about in the section on Encapsulation.
//
//What access modifier restricts access the most for what we need?
//If it is a field, could we restrict the access to private and use getters and setters?
//If we do set fields to private, what access level do we have to give our getters and setters?