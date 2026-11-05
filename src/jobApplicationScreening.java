import java.util.Scanner;

public class jobApplicationScreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Applicants Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Years of Work Experience: ");
        int yrExp = scanner.nextInt();
        System.out.print("Do you have Degree? True or False: ");
        boolean collegeDegree = scanner.nextBoolean();
        System.out.print("Enter your Expected Salary Amount: ");
        double expectedSalary = scanner.nextDouble();

        boolean approved = true;

        if (age < 21 ) {
            approved = false;
            System.out.println("Age requirement not met");
        }
        if (yrExp < 2){
            approved = false;
            System.out.println("Work experience not met");
        }
        if (!collegeDegree) {
            approved = false;
            System.out.println("You need a Degree");
        }
        if (expectedSalary > 30000.00) {
            approved = false;
            System.out.println("We cannot give you your expected Salary");
        }

        if (approved) {
            System.out.println("Application Approved — Schedule for Interview");
        } else {
            System.out.println("Application Rejected");
        }
        scanner.close();
    }
}
