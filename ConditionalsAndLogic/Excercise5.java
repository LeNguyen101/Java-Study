class Excercise5 {
    public static void song(int BeerBottles){
        if(BeerBottles == 0){
            System.out.println();
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("’cause there are no more bottles of beer on the wall!"); 
        } else {
            System.out.println(BeerBottles + " bottles of beer on the wall,");
            System.out.println(BeerBottles + " bottles of beer,");
            System.out.println("ya’ take one down, ya’ pass it around,");
            System.out.println((BeerBottles -1) + " bottles of beer on the wall.");
            System.out.println();
        }
    }
        
    public static void main(String[] args) {
        Excercise5 beer = new Excercise5();
        for(int i = 3; i>=0; i--){ 
            beer.song(i);
        }
      }
   }
 
