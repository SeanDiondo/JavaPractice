import java.util.Scanner;

public class dayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays
        String day[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String week[] = {"Weekday", "Weekend"};

        // Accept number from 1 to 7
        System.out.println("Enter Number: ");
        int num = scanner.nextInt();

        // Switch case
        switch (num) {
            case 1:
               System.out.println("Day: " + day[0]);
               System.out.println("Week: " +week[0]);
            break;
            case 2:
                System.out.println("Day: " + day[1]);
                System.out.println("Week: " +week[0]);
            break;
            case 3:
                System.out.println("Day: " + day[2]);
                System.out.println("Week: " +week[0]);
                break;
            case 4:
                System.out.println("Day: " + day[3]);
                System.out.println("Week: " +week[0]);
                break;
            case 5:
                System.out.println("Day: " + day[4]);
                System.out.println("Week: " +week[0]);
                break;
            case 6:
                System.out.println("Day: " + day[5]);
                System.out.println("Week: " +week[1]);
                break;
            case 7:
                System.out.println("Day: " + day[6]);
                System.out.println("Week: " +week[1]);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        scanner.close();
    }
}
