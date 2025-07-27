import java.util.Scanner;

public class avg{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //int a = Integer.parseInt(args[0]);
        //int b = Integer.parseInt(args[1]);
        //int c = Integer.parseInt(args[2]);
        System.out.println("enter the 1st number: ");
            int a = scanner.nextInt();
        System.out.println("enter the 2nd number: ");
            int b = scanner.nextInt();
        System.out.println("enter the 3rd number: ");
            int c = scanner.nextInt();

        float avg = (float)(a+b+c)/3;
        System.out.println(avg);
        scanner.close();
    }
}