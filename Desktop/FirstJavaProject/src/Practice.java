public class Practice {
    public static void main(String[] args) {
        //When 90 and 100 print is Student got an A
        //80-89 print is Student got a B
        //70-79 print is Student got a C
        //60-69 print is Student got a D
        //0-59 print is Student got a F
        int grade = 55;

        if (grade >= 90 && grade <= 100) {
            System.out.println("Grade is A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Grade is B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Grade is C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Grade is D");
        } else if (grade >= 0 && grade <=59) {
            System.out.println("Grade is F");
        }

    }
}
