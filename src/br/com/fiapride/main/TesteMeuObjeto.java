package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        Controle controle = new Controle(80, "Branco");

        PS5Digital ps5Digital = new PS5Digital("Branco", controle, 1000);
        System.out.println(ps5Digital.getArmazenamentoDigital());

        PS5MidiaFisica ps5Midia = new PS5MidiaFisica("Preto", controle, true);
        System.out.println(ps5Midia.isPossuiLeitorDisco());
    }
}