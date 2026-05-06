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

            if (ps5 instanceof PS5Digital) {
                PS5Digital d = (PS5Digital) ps5;
                System.out.println("Armazenamento: " + d.getArmazenamentoDigital());
            }

            if (ps5 instanceof PS5MidiaFisica) {
                PS5MidiaFisica m = (PS5MidiaFisica) ps5;
                System.out.println("Leitor de disco: " + m.isPossuiLeitorDisco());
            }

            System.out.println("Consumo: " + ps5.calcularConsumoEnergia());
            System.out.println("-------------------");
        }
    }
}