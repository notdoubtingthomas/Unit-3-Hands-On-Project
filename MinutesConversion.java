import java.util.Scanner;

/*
Unit 3 Project 1: MinutesConversion (Starter with TODOs)
Goal: Convert minutes (int) into hours and days (double) using methods and formatted output.
*/

public class MinutesConversion {

    // TODO 1: convertToHours(int minutes) -> double

    public static double convertToHours(int minutes) {
        double hours = minutes / 60.0;
        return hours;
    }

    // TODO 2: convertToDays(int minutes) -> double

    public static double convertToDays(int minutes) {
        double days = minutes / (60.0 * 24);
        return days;
    }

    // TODO 3: buildOutput(int minutes, double hours, double days) -> String

    public static String buildOutput(int minutes, double hours, double days) {
        return String.format("%d minutes equals %.0f hours and equals %.3f days.", minutes, hours, days);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of minutes (integer >= 0): ");
        // TODO 4: Read minutes
        int minutes = input.nextInt();

        // TODO 5: Validate minutes >= 0 else print error and return
        if (minutes < 0) {
            System.out.println("Error, minutes must be greater than or equal to 0.");
            return;
        }
        // TODO 6: Compute hours and days using methods
        double hours = convertToHours(minutes);
        double days = convertToDays(minutes);

        // TODO 7: Print formatted output
        System.out.println(buildOutput(minutes, hours, days));

        input.close();
    }
}
