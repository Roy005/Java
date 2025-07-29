public class DigitSumCLI {
    public static void main(String[] args) {
        // Check if input is provided
        if (args.length != 1) {
            System.out.println("Usage: java DigitSumCLI <integer between 0 and 1000>");
            return;
        }

        // Parse the input
        int number = Integer.parseInt(args[0]);

        // Check if the number is within range
        if (number < 0 || number > 1000) {
            System.out.println("Error: Number must be between 0 and 1000.");
            return;
        }

        int sum = 0;
        int temp = number;

        // Calculate digit sum
        while (temp > 0) {
            sum += temp % 10;  // Add last digit
            temp /= 10;        // Remove last digit
        }

        System.out.println("The sum of digits in " + number + " is: " + sum);
    }
}
