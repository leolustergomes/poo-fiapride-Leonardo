package br.com.fiapride.main;

import br.com.fiapride.model.Playstation_5;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        Playstation_5 ps5 = new Playstation_5("Branco", 80);

        ps5.ligar();
        ps5.setMultiplayer(true);
        ps5.exibirStatus();

        Playstation_5 ps5Erro = new Playstation_5("", 150);
        ps5Erro.exibirStatus();
    }
}