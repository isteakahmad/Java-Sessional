import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        int marks = input.nextInt();

        if (marks >= 80 && marks <= 100) {
            System.out.println("Grade: A+");
        }
        else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade: A");
        }
        else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: B");
        }
        else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade: C");
        }
        else if (marks >= 40 && marks <= 49) {
            System.out.println("Grade: D");
        }
        else if (marks < 40 && marks >= 0) {
            System.out.println("Grade: Fail");
        }
        else {
            System.out.println("Invalid marks. Please enter between 0–100.");
        }
    }
}

