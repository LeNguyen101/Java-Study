import java.util.Scanner;
/**
 * クラス Review の注釈をここに書きます.
 * 
 * 
 */
public class Review {
    public static void main(String[] args) {
        
        double value_in_inches, cm;
        Scanner in = new Scanner(System.in);
        System.out.println("How many inches?: ");
        
        // Get the data value in inches
        value_in_inches = in.nextInt(); 
        
        
        //Multiplay value in inches by 2.54
        cm = value_in_inches * 2.54;
        
        
        
        
        // Show display the result
        System.out.println(cm);
       
        
        

    }
}