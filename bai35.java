
/**
 * Write a description of class bai35 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bai35{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if((i==1 || i==5) && (j==1 || j==5)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
