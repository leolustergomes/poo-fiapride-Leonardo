package br.com.fiapride.main;

import java.util.ArrayList;
import java.util.List;
import br.com.fiapride.model.*;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        Controle controle = new Controle(80, "Branco");

        PS5Digital ps5Digital = new PS5Digital("Branco", controle, 1000);
        PS5MidiaFisica ps5Midia = new PS5MidiaFisica("Preto", controle, true);

        List<Playstation_5> lista = new ArrayList<>();

        lista.add(ps5Digital);
        lista.add(ps5Midia);

        for (Playstation_5 ps5 : lista) {
            System.out.println(ps5.calcularConsumoEnergia());
        }
    }
}