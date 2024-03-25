import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorielleTest {

    @Test
    public void testCalculerFactorielle() {
        Factorielle factorielle = new Factorielle();

        // Test avec un entier positif
        double resultatPositif = factorielle.calculerFactorielle(5);
        assertEquals(120, resultatPositif);

        // Test avec zéro (la factorielle de zéro est 1)
        double resultatZero = factorielle.calculerFactorielle(0);
        assertEquals(1, resultatZero);

        // Test avec un entier négatif (doit lancer une exception)
        try {
            factorielle.calculerFactorielle(-3);
        } catch (IllegalArgumentException e) {
            assertEquals("Le nombre doit être un entier positif ou nul.", e.getMessage());
        }
    }
}
