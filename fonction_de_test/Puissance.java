public class Puissance {

    public double calculerPuissance(double x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("L'exposant doit être un entier positif ou nul pour calculer la puissance.");
        }
        double resultat = 1;
        for (int i = 0; i < n; i++) {
            resultat *= x;
        }
        return resultat;
    }
}
