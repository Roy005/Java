public class Swap {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    System.out.println("Before swapping:");
    System.out.println("a = " + a + ", b = " + b);

    // Swapping logic
    int temp = a;
    a = b;
    b = temp;

    System.out.println("After swapping:");
    System.out.println("a = " + a + ", b = " + b);
  }
}
