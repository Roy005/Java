import java.util.*;

public class LeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter the year:");
            int year = sc.nextInt();
            if (year<0){
                System.out.println("you're idiot!! put some valid year");
            }
            else{
                if(year%4==0 && (year%100 != 0 ||year%400==0)){
                    System.out.println(year+" is a leap year");
                }
                else{
                    System.out.println(year+" is not a leap year");
                }
            }
        }
        catch(InputMismatchException e){
            System.out.println("Error!! enter integers");
        }
        sc.close();
    }
}