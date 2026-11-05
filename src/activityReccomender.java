import java.util.Scanner;

public class activityReccomender {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Months Number: ");
        short monthNumber = scanner.nextShort();

        String month[] = {"January", "February", "March", "April", "May",
                        "June", "July", "August", "September", "October",
                        "November", "December"};
        String season = "";

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                System.out.println("Season: Winter");
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                System.out.println("Season: Spring");
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                System.out.println("Season: Summer");
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                System.out.println("Season: Fall");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
        if (season.equals("Winter")) {
            System.out.println("Stay indoors and Drink Hot Chocolate");
        } else if (season.equals("Spring")) {
            System.out.println("Go Hiking or Visit a Garden");
        } else if (season.equals("Summer")) {
            System.out.println("Go Swimming or Visit the beach");
        } else if (season.equals("Fall")) {
            System.out.println("Go sightseeing or Apple Picking");
        } else {
            System.out.println("No Season");
        }
        scanner.close();
    }
}
