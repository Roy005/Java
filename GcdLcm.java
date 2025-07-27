import java.util.*;

public class GcdLcm{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("enter first number: ");
            int num1 = scanner.nextInt();
            System.out.println("enter second number: ");
            int num2 = scanner.nextInt();
            num1 = Math.abs(num1);
            num2 = Math.abs(num2);

            int a=num1;
            int b=num2;
            while(b != 0){
                int temp = b;
                b = a%b;
                a = temp;
            }
            int gcd = a;
            long lcm = (num1*num2)/gcd;
            System.out.println("gcd of "+ num1 +" and "+ num2 +" is "+ gcd);
            System.out.println("lcm of "+ num1 +" and "+ num2 +" is "+ lcm);
        }catch(InputMismatchException e){
            System.out.println("error!! enter valid integers");
        }
        scanner.close();
    }
}