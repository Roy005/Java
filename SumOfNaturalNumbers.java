import java.util.*;

public class SumOfNaturalNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter the number:");
            long n = sc.nextInt();
            if(n < 0){
                System.out.println("error!!enter a positive integer");
            }
            else{
                long sum = n* (n+1)/2;
                System.out.println("sum of the first "+n+" natural number is "+sum);
            }
        }
        catch(InputMismatchException e){
            System.out.println("Error!! enter integers");
        }
        sc.close();
    }
}