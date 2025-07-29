class Factorial {
  public static void main(String[] args) {
    int n = 5;
    long factorial = 1;
    if(n<0) {
      System.out.println("Factorial is not defined");
    }
    else {
      for(int i = 1; i<=n ; i++){
        factorial*= i;
      }
      System.out.println("Factorial of " + n + " is " + factorial);
    }
    
  }
}