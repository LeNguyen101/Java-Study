
/**
 * Write a description of class bai30 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bai30{
     public static void main(String[] args){
         int []n={4, 10, 8, 2,1, 6, 3, 5, 7, 9, 11};
         if(n.length%2==0){
             System.out.printf("%d,%d", n[n.length/2],n[(n.length/2)-1]);
             }else{
                 int a=n.length/2;
                 System.out.print(n[a]);
        } 
    }
}
  
   
