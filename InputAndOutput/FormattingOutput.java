import java.util.Scanner;
 public class FormattingOutput {
     public static void main(String[] args) {
        System.out.print(4.0 / 3.0); 
        System.out.printf("Four thirds = %.3f", 4.0 / 3.0);
        int inch = 100;
        Scanner in = new Scanner(System.in);
        double cmPerInch = 2.54;
        final double CM_PER_INCH = 2.54;
        double cm = inch * CM_PER_INCH;
        System.out.printf("%d in = %f cm\n", inch, cm);
        }
     }