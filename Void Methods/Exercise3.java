public class Exercise3 {
    public static void printAmerican(String day, String month, int date, int year){
        System.out.println("American format:");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(", ");
        System.out.println(year);
        
    }
    
    
    public static void printEuropean(String day, int date, String month, int year){
        System.out.println("European format:");
        System.out.print(day);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.println(year);
        
    }
    
    public static void main(String[] args) {
        String day = ("Saturday");
        String month = ("July");
        int date = 22;
        int year = 2015;
        printAmerican(day, month, date, year);
        printEuropean(day, date, month, year);
        
    }
}

        
        
        
    
         

    
    
    
