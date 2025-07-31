import java.util.*;

public class twoint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the two numbers (25-75):");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(num1<25 || num1>75 ||num2<25 ||num2>75){
                System.out.println("Error: Numbers must be between 25 and 75.");
            }else{
                int num1_1 = num1/10;
                int num1_2 = num1%10;
                int num2_1 = num2/10;
                int num2_2 = num2%10;
                boolean hascommondigit = (num1_1==num2_1)||(num1_1==num2_2)||(num1_2==num2_1)||(num1_2==num2_2);
                System.out.println("The numbers " + num1 + " and " + num2 + " have a common digit: " + hascommondigit);
            }
        }catch(InputMismatchException e){
            System.out.println("Error !! enter valid numbers");
        }
        sc.close();
    }
}