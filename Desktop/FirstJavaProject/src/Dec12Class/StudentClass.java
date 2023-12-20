package Dec12Class;

public class StudentClass {
    // student class name, roll number, score if score > 80 ->A or else it will print student did not get an A
     private String name;
     private int rollNumber;
     private static int grade;
    //private because more control over the variables


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void printGrade() {
        if (grade >= 80){
            System.out.println(name+ " got an A");
        } else {
            System.out.println(name+ " did not get an A");
        }

    }
}
