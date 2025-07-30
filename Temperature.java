import java.util.*;

public class Temperature{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter the temperature in fahrenheit:");
            float fahrenheit = sc.nextFloat();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("temperature in celsius is "+celsius);
            }
        catch(InputMismatchException e){
            System.out.println("error!! enter valid number");
        }
        sc.close();
    }
}