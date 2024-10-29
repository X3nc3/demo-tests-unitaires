package utils;

import org.junit.jupiter.api.Test;

import static fr.diginamic.utils.StringUtils.levenshteinDistance;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void testLevenshteinDistance() {
        int resultat = levenshteinDistance("aviron", "avion");

        assertEquals(1, resultat);
    }

    @Test
    public void testLevenshteinDistance2() {
        int resultat = levenshteinDistance("distance", "instance");

        assertEquals(2, resultat);
    }

    @Test
    public void testLevenshteinDistance3() {
        int resultat = levenshteinDistance(null, null);

        assertEquals(0, resultat);
    }
}
