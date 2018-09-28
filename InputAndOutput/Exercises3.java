import java.util.Scanner;
public class Exercises3{
    public static void main(String[] args) {
        int Seconds;
        int Hours;
        int Minutes;
        int remainder;
        final int Sec_Per_Hour = 3600;
        final int Sec_Per_Min = 60;
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Exactly how many Seconds? ");
        Seconds = in.nextInt();

        // convert and output the result
        Hours = (int) (Seconds/Sec_Per_Hour);
        Minutes = (Seconds % Sec_Per_Hour/Sec_Per_Min);
        remainder = (Seconds % Sec_Per_Min);
        System.out.printf("%d Second= %d Hours, %d Mins, %d Secs/n", Seconds, Hours, Minutes);
        }
}