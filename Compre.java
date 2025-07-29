import java.util.*;

public class Compre{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("enter a number:");
            int a = scanner.nextInt();
            System.out.println("enter another number:");
            int b = scanner.nextInt();

            if(a>b){
                System.out.println(a+" is greater than "+b);
            }
            else if(a<b){
                System.out.println(a+" is lesser than "+b);
            }
            else{
                System.out.println(a+" is equalto "+b);
            }
        }catch(InputMismatchException e){
            System.out.println("error!! enter valid integer numbers");
        }
        scanner.close();
    }
}