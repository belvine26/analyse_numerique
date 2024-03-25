import java.lang.Math.*;
public class Factorielle {

    public double calculerFactorielle(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le nombre doit être un entier positif ou nul.");
        }
        double resultat = Math.sqrt(2*Math.PI*n) * Math.pow((n/Math.E), n) ;

        return resultat ;
    }
}
