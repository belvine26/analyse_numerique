import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

public class Equation_reelTest {
    @Test
    public void testResoudreEquation_reel() {
        // Test a different de 0 , Test avec discriminant positif
        double a = 1;
        double b = 0;
        double c = -1;
        double[] solutionsObtenues = Equation_reel.resoudreEquation_reel(a, b, c);
        double x1 = solutionsObtenues[0];
        double x2 = solutionsObtenues[1];
        Assertions.assertEquals(-1,x2, 0.0000000000000000000001);
        Assertions.assertEquals(1,x1, 0.00000000000000000000001);

        // Test a different de 0 , avec discriminant négatif
        a = 1;
        b = 0;
        c = 1;
        solutionsObtenues = Equation_reel.resoudreEquation_reel(a, b, c);
        Assertions.assertEquals(0, solutionsObtenues.length);

        // Test avec discriminant nul
        a = 9;
        b = 6;
        c = 1;
        solutionsObtenues = Equation_reel.resoudreEquation_reel(a, b, c);
        double x = solutionsObtenues[0];
        Assertions.assertEquals(0.33, x, 0.00000000000000000000000001);

        // Test pour a=0 et b different  0
        a = 0;
        b = -1;
        c = 1;
        solutionsObtenues = Equation_reel.resoudreEquation_reel(a, b, c);
        double y = solutionsObtenues[0];
        Assertions.assertEquals(1, y, 0.0001);

        // Test avec a,b,c=0 (doit lancer une exception)
        try {
            Equation_reel.resoudreEquation_reel(0,0,0);
        } catch (IllegalArgumentException e) {
            assertEquals("L'equation admet une infinité de solution", e.getMessage());
        }

        // Test avec a,b=0,  c different 0 (doit lancer une exception)
        try {
            Equation_reel.resoudreEquation_reel(0,0,3);
        } catch (IllegalArgumentException e) {
            assertEquals("L'equation n'admet pas de solution", e.getMessage());
         }
    }
}