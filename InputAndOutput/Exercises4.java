import java.util.Scanner;
import java.util.Random;
class Exercises4 {
    public static void main(String args[]) {
        
        System.out.printf("Im thinking of a number between 1 and 100. Can You guess ?");
        
         // pick a random number
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int number, numbers, off;
         
         System.out.print("Type Any Number: ");
         number = in.nextInt();
         System.out.printf("Your Guess Number: %02d",number);
         
         numbers= random.nextInt(100) + 1;
         System.out.printf("The number I was thinkking is: %02d",numbers);
         off = numbers-number;
         System.out.printf("You are off by: %02d", off);
        
    }
}
