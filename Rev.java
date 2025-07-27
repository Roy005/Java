import java.util.*;

public class Rev{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("enter the number: ");
            int num = scanner.nextInt();
            int original_number = Math.abs(num);
            int reverse = 0;

            int temp = original_number;
            while(temp>0){
                int digit = temp%10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }
            System.out.println("the reverse of "+ original_number+ " is " + reverse);
            int difference = original_number - reverse;
            System.out.println("Difference b/w "+original_number+" and "+reverse+" is "+difference);
        }catch(InputMismatchException e){
            System.out.println("error!! enter any integer number");
        }
        scanner.close();
    }
}