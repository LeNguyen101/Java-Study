
/**
 * Write a description of class bai26 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bai26{
    public static void main(String[] args){
        int numbers[]={4,75,23,18,11,98};
        int min,max;
        min=max=numbers[0];
         for(int i=1;i<6;i++){
            if(numbers[i]< min)
            min=numbers[i];
            if(numbers[i]> max){
            max=numbers[i];
            }
        }
        System.out.println("min number is: "+ min);
        System.out.println("max number is: "+ max);
    }
    
}
