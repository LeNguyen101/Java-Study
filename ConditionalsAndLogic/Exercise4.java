public class Exercise4 {
    public static void checkFermat(int a, int b, int c, int n) {
        double x = Math.pow(a, n);
        double y = Math.pow(b, n);
        double z = Math.pow(c, n);
        if(n > 2 && x+y == z) {
            System.out.println("“Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("“No, that doesn’t work.”");    
    }
  }
  
  public static void main (String[] args){
      checkFermat(1, 2, 3, 4);
      checkFermat(2, 3, 4, 5);
      checkFermat(3, 4, 5, 6);
      checkFermat(9, 8, 7, 1);
    }
}