package StudyExamples;

import java.util.Scanner;

public class Study1 {
    public static void main(String[] args) {
    int totalClass= 69;
    int totalAttendance= 19;

    double percentage = (double) (totalClass * .75);

    if(totalAttendance > percentage){
        System.out.println("He can attend " + percentage);
    } else {
        System.out.println("He can't attend " + percentage);
    }

        }
    }

