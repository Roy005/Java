public class cal{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        float div = (float)a/b;
        int rem = a%b;
        float avg = (float)(a+b)/2;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Remainder: " + rem);
        System.out.println("Average: " + avg);


    } 
}