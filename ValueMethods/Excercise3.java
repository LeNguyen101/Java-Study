
/**
 * Write a description of class Excercise3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Excercise3{
    public static boolean isTriangle(int x, int y, int z) {
        if (x == y && y == z) {
            return true ;
     } else {
            return false ;
     }
   }
   
   public static void main(String[] args) {
       System.out.println(isTriangle(3, 3, 3));
       boolean bigStick = !isTriangle(3, 3, 4);
   }
}
