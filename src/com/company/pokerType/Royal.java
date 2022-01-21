package com.company.pokerType;

public class Royal extends Poker{

    public Royal() {
        super(3, 7);
    }

    @Override
    public void startGame() {
        System.out.println("Ce mode de jeux est en construction. Veuiller choisir un autre type de poker. \n");
    }
}
