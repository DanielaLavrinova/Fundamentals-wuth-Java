package student;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public Student(String firstName,String lastName,int age,String homeTown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getHomeTown() {
        return this.homeTown;
    }

    public int getAge() {
        return this.age;
    }

    public  boolean isStudentExisting(List<Student>studentList,String firstName,String lastName){

        for (Student student:studentList) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}
