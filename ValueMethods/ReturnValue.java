public class ReturnValue {
    public static void countup (int n) {
        if (n == 0) {
            System.out.println("Blassoff!");
    } else {
        countup(n - 1);
        System.out.println(n);
    }
  }
}