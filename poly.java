import java.util.*;

public class poly{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter the number of sides of polygon");
            int n = sc.nextInt();
            System.out.println("enter the length each of sides of polygon");
            float i = sc.nextFloat();
            if(n<0 || i<0){
                System.out.println("error!! enter positive value");
            }
            else{
            double a = (Math.pow(i,2)*n) / (4*Math.tan(Math.PI/n));
            System.out.println("Area of the polygon is "+a);
            }
        }catch(InputMismatchException e){
            System.out.println("error!! enter valid number");
        }
        sc.close();
    }
}