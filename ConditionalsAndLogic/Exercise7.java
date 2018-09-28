import java.util.Scanner;
import java.util.Random;
public class Exercise7 {
     public static void Lower(int number,int number1) {
      Scanner in = new Scanner(System.in);
      System.out.print("Too Low , try again  ");
      number1 = in.nextInt();
      if (number1==number) {
      System.out.println("You are right");}
      else if (number1>number) 
      Higher(number,number1);
      else 
      Lower(number,number1); 
   }

   public static void Higher(int number,int number1) {
      Scanner in = new Scanner(System.in);
      System.out.print("Too High, try again  ");
      number1 = in.nextInt();
      if (number1 == number) {
      System.out.println("You are right");}
      else if (number1 > number) 
      Higher(number,number1);
      else 
      Lower(number,number1); 
   }



   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Random random = new Random();
      int number = random.nextInt(100) + 1;
      int number1;
      System.out.print("Type a number:  ");
      number1 = in.nextInt();
      if (number1 == number) {
      System.out.println("You are right");}
      else if (number1 > number) 
      Higher(number,number1);
      else 
      Lower(number,number);}
}