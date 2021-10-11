public class Rhombus {
    public double calcRadius(double side, double alpha) {
        double rad = alpha * Math.PI/180;
        return 1.0/2.0 * side * Math.sin(rad);
    }
}
