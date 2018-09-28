public class RecursiveStackDiagrams {
    public static void countdown(int n) {
        if (n==0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n-1);
        }
    }
    
    public static void forever(String s) {
        System.out.println(s);
        forever(s);
    }
 }
