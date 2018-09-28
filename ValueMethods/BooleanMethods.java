public class BooleanMethods {
    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(isSingleDigit(2));
        boolean  bigflag = !isSingleDigit(17);
    }
}