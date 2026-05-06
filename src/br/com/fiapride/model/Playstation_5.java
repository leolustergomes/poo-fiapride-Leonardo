package br.com.fiapride.model;

public class Playstation_5 {

    private String cor;
    private boolean ligado;
    private int nivelBateriaControle; // 0 a 100
    private boolean multiplayer;

    public void ligar() {
        if (ligado) {
            System.out.println("O PS5 já está ligado!");
        } else {
            ligado = true;
            System.out.println("PS5 ligado!");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O PS5 já está desligado!");
        } else {
            ligado = false;
            System.out.println("PS5 desligado!");
        }
    }

    public void ajustarBateria(int nivel) {
        if (nivel < 0 || nivel > 100) {
            System.out.println("Bateria inválida! Use valores entre 0 e 100.");
            return;
        }
        nivelBateriaControle = nivel;
        System.out.println("Bateria ajustada para: " + nivelBateriaControle + "%");
    }

    public void ativarMultiplayer(boolean status) {
        multiplayer = status;
        System.out.println("Multiplayer: " + (multiplayer ? "Ativado" : "Desativado"));
    }

    public void exibirStatus() {
        System.out.println("Cor: " + cor);
        System.out.println("Ligado: " + ligado);
        System.out.println("Bateria: " + nivelBateriaControle + "%");
        System.out.println("Multiplayer: " + multiplayer);
        System.out.println("----------------------");
    }

    public void setCor(String cor) {
        if (cor == null || cor.isEmpty()) {
            System.out.println("Cor inválida!");
            return;
        }
        this.cor = cor;
    }
}
