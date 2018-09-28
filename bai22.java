public class bai22{
     public static void main(String[] args) {
         int x = 1;
               for (int a=1; a<=5; a++) {
             
               for (int b=1; b<=5; b++) {
                  
                   if ((a==b)||(a+b==6)) {
                    System.out.print(x++);
                   }else {
                    System.out.print(" ");
                   }
               }
              System.out.println();
          }
     } 
  }