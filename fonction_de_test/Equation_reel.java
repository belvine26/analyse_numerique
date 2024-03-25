import java.lang.*;
public class Equation_reel {

    public static double[] resoudreEquation_reel(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    throw new IllegalArgumentException ("L'equation admet une infinité de solution");
                }
                throw new IllegalArgumentException("L'equation n'admet pas de solution");
            }
            double y = -c / (b);
            return new double[]{y};
        }
        else {
            double discriminant = ((b * b) - 4 * a * c);
            if (discriminant < 0) {
                // Pas de solutions réelles
                return new double[0];
            } else if (discriminant == 0) {
                // Une seule solution réelle
                double x = -b / (2 * a);
                return new double[]{x};
            } else {
                // Deux solutions réelles
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                return new double[]{x1, x2};
            }
        }
    }
}