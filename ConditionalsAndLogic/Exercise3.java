public class Exercise3 {
    public static void countdown(int n) {
        if (n == 4) {
      System.out.println("Blastoff!");
    } else {
      System.out.println (n);
      countdown(n - 1);
    }
  }
  
   public static void nLines(int n) {
      if (n > 0) {
      System.out.println ();
      nLines(n-1);  
    } 
  }
}