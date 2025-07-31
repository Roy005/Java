import java.util.*;

public class sumcompare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter first integer number:");
            int num1 = sc.nextInt();
            System.out.println("enter second integer number:");
            int num2 = sc.nextInt();
            System.out.println("enter third integer number:");
            int num3 = sc.nextInt();

            int sum = num1 + num2;
            boolean is_equal = (sum == num3);
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
            System.out.println("The sum is equal to the third number: "+ is_equal);
        }
        catch(InputMismatchException e){
            System.out.println("Error!! enter integers");
        }
        sc.close();
    }
}