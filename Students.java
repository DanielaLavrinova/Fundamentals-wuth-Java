package students;

public class Students {
    private String firstName;
    private String lastName;
    private double grade;

    public Students(String firstName,String lastName,double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        //return this.firstName + " " + this.lastName + ": " + this.grade;
        return String.format("%s %s: %.2f",this.firstName,this.lastName,this.grade);
    }
}
