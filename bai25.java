
/**
 * Write a description of class ar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bai25 {
   public static void main(String[] args) {
      int[] numbers = { 12,32,43,8,42,90 };
      for (int i = 0; i < numbers.length / 2; i++) {
         int temp = numbers[i];
         numbers[i] = numbers[numbers.length - 1 - i];
         numbers[numbers.length - 1 - i] = temp;
      } 
      
      
      for (int i = 0; i < numbers.length; i++) {
         System.out.print(numbers[i] + " ");
      } 
   }
}