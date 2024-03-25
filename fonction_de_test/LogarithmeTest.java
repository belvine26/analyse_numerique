import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogarithmeTest {

    @Test
    public void testCalculerLogarithme() {
        Logarithme logarithme = new Logarithme();

        // Test avec un nombre positif
        double resultatPositif = logarithme.calculerLogarithme(10);
        assertEquals(2.302585092994046, resultatPositif, 0.0001); // Précision de 4 chiffres après la virgule

        // Test avec un nombre négatif (doit lancer une exception)
        assertThrows(IllegalArgumentException.class, () -> {
            logarithme.calculerLogarithme(-5);
        });
    }
}
