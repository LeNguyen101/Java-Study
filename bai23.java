
/**
 * Write a description of class bai23 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bai23 {
    public static void main(String[] args){
        for(int x=1;x<=15;x++){
            if(x%15 == 0) {
                System.out.print("Fizzbuzz");
            }
            else if(x % 3==0){
                System.out.print("fizz"+" ");
            }
            else if(x % 5 == 0){
                System.out.print("Buzz"+" ");
            }
            else{
                System.out.print(x + " ");
            }
        }
      }
            
    }


    