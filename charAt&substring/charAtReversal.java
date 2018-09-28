
/**
 * Write a description of class charAirReserse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class charAtReversal{
    public static void main(String[] args) {
	    String name = "Nguyen";
	    for(int i=name.length()-1;i>=0;i--){
	        
	        char reversal = name.charAt(i);
	    
	        System.out.println(reversal);
	    }
    }
}
