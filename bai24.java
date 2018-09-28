
/**
 * Write a description of class bai24 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bai24{
    public static void main(String[] args){
        for(int x=1;x<=14;x++){
            if(x%14==0){
                System.out.print("PineApple");
            }
            else if(x%2 == 0){
                System.out.print("Pine"+" ");
            }
            else if(x%7 == 0){
                System.out.print("Apple"+" ");
            }else{
                System.out.print(x+" ");
            }
        }
    }
}
