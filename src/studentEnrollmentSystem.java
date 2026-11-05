import java.util.Scanner;

public class studentEnrollmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Step 1
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        short age = scanner.nextShort();
        System.out.print("Student Passed the Entrance Exam? True or False: ");
        boolean passedExam = scanner.nextBoolean();
        boolean eligible = true;

        if (age < 18) {
            eligible = false;
            System.out.println("Age Requirement not met");
            return;
        } else if (!passedExam) {
            eligible = false;
            System.out.println("Entrance Exam Requirement not met");
            return;
        } else {
            System.out.println("Proceed to Course Track");
        }
        //Step 2 Course Track
        System.out.print("Enter Exam Score: ");
        int score = scanner.nextInt();
        String courseTrack = "";

        if (score < 0 || score > 100) {
            System.out.println("Invalid Exam Score");
            return;
        }

        switch (score / 10) {
            case 10:
            case 9:
                courseTrack = "Science and Technology Track";
                break;
            case 8:
                courseTrack = "Business and Accounting Track";
                break;
            case 7:
                courseTrack = "Humanities and Social Science Track";
                break;
            default:
                courseTrack = "General Academics Track";
                break;
        }
        //Step 3 Scholarship Eligibility
        String scholarship = "";
        if (score >= 95 && age <= 25) {
            scholarship = "Full Scholarship";
        } else if (score >= 85 && age <= 25) {
            scholarship = "Partial Scholarship";
        } else {
            scholarship = "No Scholarship";
        }
        //Step 4 Printing Result
        String status = eligible ? "Enrolled" : "Not Enrolled";
        System.out.println("===== ENROLLMENT SUMMARY =====");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Entrance Exam Score: " + score);
        System.out.println("Course Track: " + courseTrack);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Status: " + status);
    }
}
