import java.util.*;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the number of terms: ");
            int n = scanner.nextInt();
            if(n<=0){
                System.out.println("error!!enter positive integer");
            }
            else{
                long first = 0;
                long second = 1;
                System.out.println("Fibonacci series upto "+ n +" term is:");
                if(n>=1){
                    System.out.println(first);
                    for(int i = 2; i<=n; i++){
                        System.out.println(second);
                        long result = first + second;
                        first = second;
                        second = result;
                    }
                }
            }
        }catch(InputMismatchException e){
            System.out.println("error!! enter any integer");
        }
        scanner.close();
    }
}