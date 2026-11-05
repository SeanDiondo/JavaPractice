import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Math Grade: ");
        short mathGrade = scanner.nextShort();
        System.out.print("Enter Science Grade: ");
        short scienceGrade = scanner.nextShort();
        System.out.print("Enter English Grade: ");
        short englishGrade = scanner.nextShort();
        System.out.print("Enter Physics Grade: ");
        short physicsGrade = scanner.nextShort();
        System.out.print("Enter OOP Grade: ");
        short oopGrade = scanner.nextShort();

        // Grading Remarks
        double average = (mathGrade + scienceGrade + englishGrade + physicsGrade + oopGrade) / 5.0;
        String honorEligibility = average >= 85 ? "Eligible" : "Not Eligible";
        String grade[] = {"A+", "A", "B+", "B", "C", "D", "F"};
        String remarks[] = {"Excellent" ,"Outstanding", "Very Good",
                            "Good", "Satisfactory", "Needs Improvement", "Failed"};

        if (average >= 95) {
            System.out.println("Average: " + average);
            System.out.println("Gradde: " + grade[0]);
            System.out.println("Remarks: " + remarks[0]);
            System.out.println("Honors Eligibility: " + honorEligibility);
        } else if (average > 89) {
            System.out.println("Average: " + average);
            System.out.println("Gradde: " + grade[1]);
            System.out.println("Remarks: " + remarks[1]);
            System.out.println("Honors Eligibility: " + honorEligibility);
        } else if (average > 84) {
            System.out.println("Average: " + average);
            System.out.println("Gradde: " + grade[2]);
            System.out.println("Remarks: " + remarks[2]);
            System.out.println("Honors Eligibility: " + honorEligibility);
        } else if (average > 79) {
            System.out.println("Average: " + average);
            System.out.println("Gradde: " + grade[3]);
            System.out.println("Remarks: " + remarks[3]);
            System.out.println("Honors Eligibility: " + honorEligibility);
        } else if (average > 74) {
            System.out.println("Average: " + average);
            System.out.println("Gradde: " + grade[4]);
            System.out.println("Remarks: " + remarks[4]);
            System.out.println("Honors Eligibility: " + honorEligibility);
        } else if (average > 69) {
            System.out.println("Average: " + average);
            System.out.println("Gradde: " + grade[5]);
            System.out.println("Remarks: " + remarks[5]);
            System.out.println("Honors Eligibility: " + honorEligibility);
        } else if (average < 70) {
            System.out.println("Average: " + average);
            System.out.println("Gradde: " + grade[6]);
            System.out.println("Remarks: " + remarks[6]);
            System.out.println("Honors Eligibility: " + honorEligibility);
        } else {
            System.out.println("Invalid Average");
        }
        scanner.close();
    }
}
