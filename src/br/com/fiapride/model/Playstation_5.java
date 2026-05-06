package br.com.fiapride.model;

public class Playstation_5 {

    private String cor;
    private boolean ligado;
    private int nivelBateriaControle; // 0 a 100
    private boolean multiplayer;

<<<<<<< HEAD
    // 🔌 Métodos de comportamento
=======
>>>>>>> 0053d3584c809446ebd3be414ebb871caefd2d2d
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

<<<<<<< HEAD
    // 🎮 GETTERS E SETTERS

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.isEmpty()) {
            System.out.println("Erro: cor inválida!");
        } else {
            this.cor = cor;
=======
    public void ajustarBateria(int nivel) {
        if (nivel < 0 || nivel > 100) {
            System.out.println("Bateria inválida! Use valores entre 0 e 100.");
            return;
>>>>>>> 0053d3584c809446ebd3be414ebb871caefd2d2d
        }
    }

<<<<<<< HEAD
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getNivelBateriaControle() {
        return nivelBateriaControle;
    }

    public void setNivelBateriaControle(int nivelBateriaControle) {
        if (nivelBateriaControle < 0 || nivelBateriaControle > 100) {
            System.out.println("Erro: bateria deve estar entre 0 e 100!");
        } else {
            this.nivelBateriaControle = nivelBateriaControle;
        }
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    // 📊 Exibir status
=======
    public void ativarMultiplayer(boolean status) {
        multiplayer = status;
        System.out.println("Multiplayer: " + (multiplayer ? "Ativado" : "Desativado"));
    }

>>>>>>> 0053d3584c809446ebd3be414ebb871caefd2d2d
    public void exibirStatus() {
        System.out.println("Cor: " + cor);
        System.out.println("Ligado: " + ligado);
        System.out.println("Bateria: " + nivelBateriaControle + "%");
        System.out.println("Multiplayer: " + multiplayer);
        System.out.println("----------------------");
    }
<<<<<<< HEAD
}
=======

    public void setCor(String cor) {
        if (cor == null || cor.isEmpty()) {
            System.out.println("Cor inválida!");
            return;
        }
        this.cor = cor;
    }
}
>>>>>>> 0053d3584c809446ebd3be414ebb871caefd2d2d
