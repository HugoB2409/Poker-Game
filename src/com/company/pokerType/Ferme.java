package com.company.pokerType;

public class Ferme extends Poker{

    public Ferme() {
        super(4, 6);
    }

    @Override
    public void startGame() {
        System.out.println("Ce mode de jeux est en construction. Veuiller choisir un autre type de poker. \n");
    }
}
