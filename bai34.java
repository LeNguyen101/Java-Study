
/**
 * Write a description of class bai34 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bai34 {
    public static void main(String[] args){
        int i,j,k;
        for (i=5;i>=1;i--){
            for(j=5;j>=i;j--){
                System.out.print(" ");
            }
            
            for(k=1;k<(i*2);k++){
                System.out.print("*");
            }
            
            System.out.println("\n");
        }
        
    }   
}


    