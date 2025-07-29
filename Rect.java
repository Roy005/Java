<<<<<<< HEAD
class Rect{
  public static void main(String[] args) {
   int l = Integer.parseInt(args[0]);
   int w = Integer.parseInt(args[1]);

   double area = (l * w);
   double perimeter = 2 * (l + w);

   System.out.println("The area is" + area);
   System.out.println("The perimeter is" + perimeter);



  }

  
=======
import java.util.*;

public class Rect{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the length");
            int l = scanner.nextInt();
            System.out.println("Enter the width");
            int d = scanner.nextInt();
            if(l<0 || d<0){
                System.out.println("error! invalid length and width");
            }
            else{
                double area = l*d;
                double perimeter = 2*(l+d);

                System.out.println("area of the rectangle is " + area + " square units");
                System.out.println("perimeter of the rectangle is " + perimeter + " square units");
            }
        }catch(InputMismatchException e){
            System.out.println("Error!! please enter valis integer");
        }
        scanner.close();
    }
>>>>>>> b365410721df2c1666fe4d6684ff93428d9e94a2
}