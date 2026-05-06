package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        Controle controle = new Controle(80, "Branco");

        PS5Digital ps5Digital = new PS5Digital("Branco", controle, 1000);
        PS5MidiaFisica ps5Midia = new PS5MidiaFisica("Preto", controle, true);

        Conectavel[] dispositivos = new Conectavel[3];

        dispositivos[0] = ps5Digital;
        dispositivos[1] = ps5Midia;
        dispositivos[2] = controle;

        for (Conectavel d : dispositivos) {
            d.conectarInternet();
            d.desconectarInternet();
            System.out.println("-----");
        }
    }
}