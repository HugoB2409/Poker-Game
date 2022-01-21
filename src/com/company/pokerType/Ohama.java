package com.company.pokerType;

public class Ohama extends Poker{

    public Ohama() {
        super(2, 10);
    }

    @Override
    public void startGame() {
        System.out.println("Ce mode de jeux est en construction. Veuiller choisir un autre type de poker. \n");
    }
}
