package br.com.fiapride.main;

import br.com.fiapride.model.Playstation_5;
import br.com.fiapride.model.Controle;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        Controle controle = new Controle(80, "Branco");

        Playstation_5 ps5 = new Playstation_5("Branco", controle);

        ps5.ligar();

        System.out.println("Bateria do controle: " + ps5.getControle().getNivelBateria());
        System.out.println("Cor do controle: " + ps5.getControle().getCor());
    }
}