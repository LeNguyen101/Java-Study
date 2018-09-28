public class MethodComposition {
    public static double circleArea
      (double xc, double yc, double xp, double yp) {
          double radius = distance(xc, yc, xp, yp);
          double area = calculateArea(radius);
     }
}
    