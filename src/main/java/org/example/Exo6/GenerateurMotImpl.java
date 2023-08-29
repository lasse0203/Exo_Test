package org.example.Exo6;

import java.util.Random;

public class GenerateurMotImpl implements GenerateurMot {
    private String[] mots = {"pendu", "ordinateur", "programme", "java", "developpement","test"};

    @Override
    public String generer() {
        Random random = new Random();
        return mots[random.nextInt(mots.length)];
    }
}