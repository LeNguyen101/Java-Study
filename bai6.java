public class bai6 {
    public static void main(String[] args) {
        
        for (int i=3; i>=1; i--) {
            
             for (int n=1; n<=i; n++){
                 if (i==n) {
                    System.out.print("x");
                 } else {
                    System.out.print(" ");
                 }     
             }
           
            System.out.println();
      } 
    }
}