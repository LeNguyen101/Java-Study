
/**
 * Write a description of class bai28 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bai28{
    public static void main(String[] args){
    
      int n[]={4, 10, 8, 2, 1, 6, 3, 5, 7, 9 };
      for(int x=0;x<=n.length-1;x++){
          
          for(int y=x+1;y<n.length;y++){
              if(n[x]>n[y]){  
                int temp=n[x];    
                n[x]=n[y];
                n[y]=temp;
            }             
          }    
      }
      for(int x=0;x<n.length;x++){
          System.out.print(n[x]+" ");
        }
   }
}

