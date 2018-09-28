
/**
 * Write a description of class bai29 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bai29 {
    public static void main(String[] args){
        int [] n={4,10,8,2,1,6,3,5,7,9};
        for (int  i=0; i<n.length-1;i++){
            for(int j=0;j<n.length-1;j++){
                if(n[j]<n[j+1]){
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        for(int j=0;j<n.length;j++){
            System.out.print(n[j]+" ");
        }
    }
}