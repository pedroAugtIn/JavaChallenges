import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while (true) {
            String number = scanner.nextLine();

            try {
                int nextNumber = Integer.parseInt(number);
                sum += nextNumber;
                counter++;
            } catch (NumberFormatException e) {
                break;
            }

        }
        long average = Math.round((float) sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
    }
}
