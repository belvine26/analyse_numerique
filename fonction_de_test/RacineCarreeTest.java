import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RacineCarreeTest {


        @Test
        public void testCalculRacineCarree() {
            RacineCarree racineCarree = new RacineCarree();

            // Appel la méthode à tester avec différentes entrées et vérifier les résultats
            assertEquals(4.0, racineCarree.calculRacineCarree(16.0, 0), 0.001);
            assertEquals(5.0, racineCarree.calculRacineCarree(25.0, 0), 0.001);
            assertEquals(2.236, racineCarree.calculRacineCarree(5.0,0), 0.001);
            assertEquals(0.0, racineCarree.calculRacineCarree(0.0, 0), 0.001);
            assertEquals(Double.NaN, racineCarree.calculRacineCarree(-9.0,0), 0.001);
        }

}
