/*This program allows me to practice reading code and to make sure that you understand the flow of execution through a program 
 with multiple methods.
 *Nguyen
 *
 */


public class Exercise1 {
    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        //printing out "You wugga"
        baffle();
        }
        
    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
        }
        
    public static void baffle () {
        System.out.print("wug");
        ping();
        //calling ping
        
        }
        
    public static void ping() {
        System.out.println(".");
        baffle();
    }
}
