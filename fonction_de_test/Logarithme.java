import java.lang.Math.*;
    public class Logarithme {

        public double calculerLogarithme(double nombre) {
            if (nombre <= 0) {
                throw new IllegalArgumentException("Le nombre doit être strictement positif pour calculer le logarithme.");
            }
            double precision = Math.pow(10,-4);
            double x = nombre;
            double n = 0;
            while (Math.abs(x - 1) > precision) {
                x = Math.sqrt(x);
                n = n+1;
            }
                double resultat = (x - 1) * Math.pow(2,n);
            
            return resultat;
        }
    }
       