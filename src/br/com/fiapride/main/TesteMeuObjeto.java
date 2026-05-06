package br.com.fiapride.main;

import br.com.fiapride.model.Playstation_5;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        Playstation_5 ps5 = new Playstation_5();

        // ✅ valores válidos
        ps5.setCor("Branco");
        ps5.setNivelBateriaControle(80);
        ps5.setMultiplayer(true);

        ps5.ligar();
        ps5.exibirStatus();

        // ❌ valores inválidos
        ps5.setCor("");
        ps5.setNivelBateriaControle(150);

        ps5.desligar();
        ps5.desligar(); // teste inválido
    }
}