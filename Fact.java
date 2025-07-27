import java.util.*;
public class Fact{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        try{
            int num = scanner.nextInt();
            if(num<0){
                System.out.println("Error!! Enter a positive Integer");
            }
            else{
                long result = 1;
                for(int i=1; i<=num; i++){
                    result *= i;
                }
                System.out.println("Factorial of "+ num +" is "+result);
            }
        }catch(InputMismatchException e){
            System.out.println("Error!! Enter a valid Integer");
        }
        scanner.close();
    }
}