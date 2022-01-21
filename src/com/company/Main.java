package com.company;

import com.company.pokerType.Ferme;
import com.company.pokerType.Ohama;
import com.company.pokerType.Royal;
import com.company.pokerType.Texas;
import com.company.utils.Utils;

public class Main {

    public static void main(String[] args) {
        int type;
        System.out.println("Bonjour choissisez le type de poker: \n");
        do {
            printOptions();
            type = Utils.readIntInBetween(1, 5);
            if(type != 5) {
                instantiateGame(type);
            }
        } while (type != 5);
        System.out.println("Au revoir.");
    }

    private static void printOptions() {
        System.out.println("1- Texas");
        System.out.println("2- Ohama");
        System.out.println("3- Royal");
        System.out.println("4- Fermé");
        System.out.println("5- Quitter le programme");
    }

    private static void instantiateGame(int type) {
        if (type == 1) {
            new Texas();
        }
        if (type == 2) {
            new Ohama();
        }
        if (type == 3) {
            new Royal();
        }
        if (type == 4) {
            new Ferme();
        }
    }
}
