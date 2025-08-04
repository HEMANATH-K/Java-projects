package studentapp;

public class Student {
    private int rollno;
    private String name;
    private String year;
    private int grade;

    // Constructor
    public Student(int rollno, String name, String year, int grade) {
        this.rollno = rollno;
        this.name = name;
        this.year = year;
        this.grade = grade;
    }

    // Getters
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public int getGrade() {
        return grade;
    }

    // Setters
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Display method
    public void display() {
        System.out.println("Roll No: " + rollno + ", Name: " + name +
                           ", Year: " + year + ", Grade: " + grade);
    }
}
