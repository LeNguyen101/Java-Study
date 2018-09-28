
/**
 * Write a description of class bai33 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bai33{
    public static void main(String[] args){
        int count =1;
        int i,j,k;
        for (i=1;i<=9;i++){
            for(j=count;j<=4;j++){
                System.out.print(" ");
            }
            count++;
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
        
    }   
}
