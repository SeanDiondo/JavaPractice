import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input person weight in Kilograms and height
        System.out.println("Enter Your Weight(KG): ");
        float weight = scanner.nextFloat();
        System.out.println("Enter Your Height(m): ");
        float height = scanner.nextFloat();

        //Compute BMI
        float BMI = (weight / (height * height));
        System.out.println(BMI);

        //Get Weight to height Caterory
        if (BMI < 18.5) {
            System.out.println("Category: Underweight");
        } else if (BMI <= 24.9) {
            System.out.println("Category: Normal");
        } else if (BMI <= 29.9) {
            System.out.println("Category: Overweight");
        } else if (BMI >= 30){
            System.out.println("Category: Obese");
        } else {
            System.out.println("Error");
        }

        scanner.close();
    }
}
