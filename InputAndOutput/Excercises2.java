import java.util.Scanner;
public class Excercises2 {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        Scanner in = new Scanner(System.in);
        System.out.print("Celcius to day is: ");
        celsius = in.nextDouble();
        // F = ( C × 1.8 ) +  32
        fahrenheit = (celsius * 1.8) + 32;
        //Print Fahrentheit.
        System.out.print(celsius + " C = ");
        System.out.println(fahrenheit + " F");
        
    }
}