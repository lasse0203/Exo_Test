package org.example.exo6Test;
import org.example.Exo6.GenerateurMot;
import org.example.Exo6.GenerateurMotImpl;
import org.example.Exo6.LePendu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LePenduTest {

    private LePendu lePendu;
    @BeforeEach
    public void setUp() {
        lePendu = new LePendu();
    }

    @Test
        public void testGenererMasque() throws Exception {
            GenerateurMot generateur = new GenerateurMotImpl();
            LePendu pendu = new LePendu();
            pendu.genererMasque(generateur);

            assertEquals("test", pendu.testMasque());
        }

        @Test
        public void testTestChar() throws Exception {
            LePendu pendu = new LePendu();
            pendu.motATrouve = "test";
            pendu.masque = "____";

            assertTrue(pendu.testChar('t'));
            assertFalse(pendu.testChar('a'));

            assertEquals("t___", pendu.masque);
        }

        @Test
        public void testTestWin() throws Exception {
            LePendu pendu = new LePendu();
            pendu.motATrouve = "test";
            pendu.masque = "test";

            assertTrue(pendu.testWin());

            pendu.masque = "____";
            assertFalse(pendu.testWin());
        }

    }


