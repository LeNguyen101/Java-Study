
/**
 * Write a description of class bai27 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bai27 {
     public static void main(String[] args) {   
 
       double a[] = {45.0 , 76.0, 23.0, 8.0, 12.0, 1.0};
       double sum= 0;
        for (int i = 0; i < a.length; i++){
        sum += a[i];
      }
      System.out.println("average = " + sum/a.length); 
   }
}
