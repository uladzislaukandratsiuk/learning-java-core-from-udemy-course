public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println(area(6));
        System.out.println(area(-2));
        System.out.println(area(5, 4));
        System.out.println(area(-3, 4));
    }

    private static double area(double radius) {

        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

    private static  double area(double x, double y) {

        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }
}
