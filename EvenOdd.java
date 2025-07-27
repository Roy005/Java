import java.util.*;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//remove this if using parselInt & dont't try try-catch block

        System.out.println("Enter the number: ");//also remove
        try {
            //int num = Integer.parseInt(args[0]);
            int num = scanner.nextInt();//also remove
            int result = (num % 2 == 0) ? 1 : 0;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer");
        }
        scanner.close();//also remove
    }
}