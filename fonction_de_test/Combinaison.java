public class Combinaison {

    public double calculerCombinaison(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("Les nombres doivent être des entiers positifs avec k <= n.");
        }
        double resultat = (Math.sqrt(2*Math.PI*n) * Math.pow((n/Math.E), n)) / ((Math.sqrt(2*Math.PI*(n - k)) * Math.pow(((n - k)/Math.E), (n - k))) * (Math.sqrt(2*Math.PI*k) * Math.pow((k/Math.E), k)));

        return resultat;
    }
}
