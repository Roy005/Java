class Rect{
  public static void main(String[] args) {
   int l = Integer.parseInt(args[0]);
   int w = Integer.parseInt(args[1]);

   double area = (l * w);
   double perimeter = 2 * (l + w);

   System.out.println("The area is" + area);
   System.out.println("The perimeter is" + perimeter);



  }

  
}