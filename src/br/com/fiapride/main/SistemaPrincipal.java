<<<<<<< HEAD
=======
package br.com.fiapride.main;

import br.com.fiapride.model.Playstation_5;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Playstation_5 meuPs5 = new Playstation_5();

        meuPs5.setCor("Branco");
        meuPs5.ligar();
        meuPs5.ajustarBateria(80);
        meuPs5.ativarMultiplayer(true);
        meuPs5.exibirStatus();

        meuPs5.ajustarBateria(150); // inválido
        meuPs5.setCor(""); // inválido
        meuPs5.desligar();
        meuPs5.desligar(); // inválido
    }
}
>>>>>>> 0053d3584c809446ebd3be414ebb871caefd2d2d
