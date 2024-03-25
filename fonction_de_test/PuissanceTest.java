import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PuissanceTest {

    @Test
    public void testCalculerPuissance() {
        Puissance puissance = new Puissance();

        // Test avec un nombre positif et une puissance positive
        double resultat = puissance.calculerPuissance(2, 3);
        assertEquals(8, resultat);

        // Test avec  une puissance nulle
        double resultatZero = puissance.calculerPuissance(5, 0);
        assertEquals(1, resultatZero);

        // Test avec un nombre negatif et une puissance positive
        double resultatNegatif = puissance.calculerPuissance(-3, 4);
        assertEquals(81, resultatNegatif);

        // Test avec un nombre positif et une puissace negative (doit lancer une exception car l'exposant est négatif)
        assertThrows(IllegalArgumentException.class, () -> {
            puissance.calculerPuissance(1.5, -2);
        });
    }
}
