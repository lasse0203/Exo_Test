package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClaculatriceTest {

    // test methode addition

    @Test
    public void testAdiition() {
        // Triple A :
        // Arrange (Organiser) :
        Calculatrice calculatrice = new Calculatrice();

        //  Act :
        double result = calculatrice.addition(10, 20);

        // Asert (vérifier) :
        Assertions.assertEquals(30, result);

    }

    public void testDivisionAvecDiff0() {
        // Arrange (Organiser) :
        Calculatrice calculatrice = new Calculatrice();
        //  Act :
        double result = calculatrice.division(10, 2);
        // Asert (vérifier) :
        Assertions.assertEquals(5, result);
    }

    public void testDivisionEgale0() {
        // Arrange (Organiser) :
        Calculatrice calculatrice = new Calculatrice();
        // Asert (vérifier) :

        Assertions.assertThrowsExactly(RuntimeException.class, () -> {
            //  Act :
            calculatrice.division(10, 0);

        });
    }
}