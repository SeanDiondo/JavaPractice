package javaCodingExercise;

public class SimpleCalculator {
    public static double calculate(int num1, int num2, char operator){
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    return 0;
                } return (double) num1 / num2;
            default:
                return 0;
        }
    } public static void main(String[] args) {
        System.out.println(calculate(5, 5, '/'));
    }
}
