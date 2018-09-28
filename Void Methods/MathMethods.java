public class MathMethods{
    public static void main(String[] args) {
        double root = Math.sqrt (17.0);
        double angle = 1.5;
        double height = Math.sin(angle);
        
        //Converting to and from radians is a common operation.
        double radians = Math.toRadians(180.0);
        double degrees = Math.toDegrees(Math.PI);
        
        long x = Math.round(Math.PI * 20.0);
        System.out.println(x);
    }
}
    