class Enter {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    // Convert n to string so we can build nn and nnn
    String nStr = Integer.toString(n);

    // Form nn and nnn by string concatenation
    int nn = Integer.parseInt(nStr + nStr);       // "5" + "5" → "55" → int 55
    int nnn = Integer.parseInt(nStr + nStr + nStr); // "5" + "5" + "5" → "555" → int 555

    // Add n + nn + nnn
    int result = n + nn + nnn;

    // Print the result in the format: 5 + 55 + 555 = 615
    System.out.println(n + " + " + nn + " + " + nnn + " = " + result);
  }
}
