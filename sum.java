import java.util.*;

public class sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter any number b/w 0 to 1000 :");
            int num = sc.nextInt();
            if(num<0 || num>1000){
                System.out.println("enter a number from the given range!!");
            }
            else{
                int sum = 0;
                int temp = num;
                while(temp>0){
                    sum += temp%10;
                    temp /= 10;
                }
                System.out.println("the sum of the digits of the integer is "+ sum);
            }
        }
        catch(InputMismatchException e){
            System.out.println("error!! enter valid number");
        }
        sc.close();
    }
}