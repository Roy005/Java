import java.util.*;

public class Armstrong{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        try{
            int number = scanner.nextInt();
            int original_number = number;
            int count = 0;
            if(number<0){
                System.out.println("error!!! enter any positive number!");
            }
            else{
                int temp = number;
                while(temp>0){
                count++;
                temp /= 10;
                }
            }
            int sum = 0;
            int temp = number;
            while(temp>0){
                int digit = temp % 10;
                sum +=(int) Math.pow(digit, count);
                temp /= 10;
            }
            if(sum==original_number){
                System.out.println(number + " is a armstrong number");
            }
            else{
                System.out.println(number + " is not a armstrong number");
            }
        }
        catch(InputMismatchException e){
            System.out.println("error!! enter a valid integer number");
        }
        scanner.close();
    }
}