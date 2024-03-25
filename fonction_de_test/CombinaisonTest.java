import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinaisonTest {

    @Test
    public void testCalculerCombinaison() {
        Combinaison combinaison = new Combinaison();

        // Test avec k<n
        double resultat = combinaison.calculerCombinaison(5, 2);
        assertEquals(10, resultat);

        // Test avec k = 0 (la combinaison de n par 0 est toujours 1)
        double resultatZero = combinaison.calculerCombinaison(10, 0);
        assertEquals(1, resultatZero);

        // Test avec k>n (doit lancer une exception)
        try {
            combinaison.calculerCombinaison(4, 6);
        } catch (IllegalArgumentException e) {
            assertEquals("Les nombres doivent être des entiers positifs avec k <= n.", e.getMessage());
        }
    }
}
