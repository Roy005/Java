class Polygon {
  public static void main(String[] args) {

    int n = Integer.parseInt(args[0]);
    int s = Integer.parseInt(args[1]);

    double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
    System.out.println("The area of polygon :" + " " + area );
  }
}