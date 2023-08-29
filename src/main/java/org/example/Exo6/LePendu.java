package org.example.Exo6;

    public class LePendu {
    private int nbEssai;
    public String masque;
    public String motATrouve;

    public void genererMasque(GenerateurMot generateurMot) throws Exception {
        motATrouve = generateurMot.generer();
        masque = "_".repeat(motATrouve.length());
    }

    public boolean testChar(char c) {
        boolean charPresent = false;
        StringBuilder nouveauMasque = new StringBuilder();

        for (int i = 0; i < motATrouve.length(); i++) {
            if (motATrouve.charAt(i) == c || masque.charAt(i) != '_') {
                nouveauMasque.append(motATrouve.charAt(i));
                if (motATrouve.charAt(i) == c) {
                    charPresent = true;
                }
            } else {
                nouveauMasque.append("_");
            }
        }

        masque = nouveauMasque.toString();
        return charPresent;
    }

    public boolean testWin() {
        return masque.equals(motATrouve);
    }


    }
