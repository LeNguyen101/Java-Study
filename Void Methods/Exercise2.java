/*
 *This program is to make sure you understand how to write and invoke methods that take parameters.
 */

public class Exercise2 {
    public static void zool(int number, String Dogname, String Streetname) {
        System.out.print(number);
        System.out.print(Dogname);
        System.out.println(Streetname);
    }
    
    public static void main(String[] args) {
        int number = 11;
        String Dogname = ("Red");
        String Streetname = ("LLC");
        zool(number, Dogname, Streetname);
        
    }
}
        
        
        

