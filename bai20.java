public class bai20 {
    public static void main(String[] args) {
        for (int i=1; i<=6; i++) {
            
             for (int n=1; n<=i; n++){
                 if (i==n) {
                    System.out.print(i);
                 } else {
                    System.out.print(" ");
                 }     
             }
           
            System.out.println();
      } 
    }
}