package br.com.fiapride.main;
 
import br.com.fiapride.model.Playstation_5;
 
public class SistemaPrincipal {
 
    public static void main(String[] args) {
 
        // Instância 1
    	Playstation_5 meuPs5 = new Playstation_5();
    	meuPs5.cor = "Branco";
    	meuPs5.marca = "Sony";
    	meuPs5.duracaoBateriaControleMin = 6.0;
    	meuPs5.duracaoBateriaControleMax = 14.0;
    	meuPs5.tipo = "Híbrido";
    	meuPs5.multiplayer = true;
 
        // Instância 2
    	Playstation_5 Ps5doamigo = new Playstation_5();
        Ps5doamigo.cor = "Preto";
 
        System.out.println("Meu Ps5: " + meuPs5.cor);
        System.out.println("Ps5 do amigo: " + Ps5doamigo.cor);
    }
}