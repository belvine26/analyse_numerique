
import static java.lang.Math.abs;

public class RacineCarree {
    public double calculRacineCarree(double nombre, double precision) {
        precision = 0.0001;
        double estimation_actuelle = nombre;
        if (nombre == 0) {return(nombre);}
        else {
            double estimation_suivante = (estimation_actuelle + (nombre / estimation_actuelle)) / 2;

            while (abs(estimation_suivante - estimation_actuelle) > precision) {
                estimation_actuelle = estimation_suivante;
                estimation_suivante = (estimation_actuelle + (nombre / estimation_actuelle)) / 2;
            }
            return estimation_suivante;
        }
    }
}


