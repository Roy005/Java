import java.util.*;

public class Circle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("enter the radius: ");
            double r = scanner.nextDouble();
            if(r<0){
                System.out.println("enter any positive value");
            }
            else{
                double area = Math.PI * r* r;
                double perimeter = 2* Math.PI* r;

                System.out.println("area of the circle is " + area);
                System.out.println("perimeter of the circle is " + perimeter);
            }
        }catch(InputMismatchException e){
            System.out.println("error!! enter any integer number");
        }
        scanner.close();
    }
}