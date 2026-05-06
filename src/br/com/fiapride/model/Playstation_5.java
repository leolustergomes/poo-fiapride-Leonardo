package br.com.fiapride.model;

public class Playstation_5 {

    private String cor;
    private boolean ligado;
    private boolean multiplayer;
    private Controle controle; 


    public Playstation_5(String cor, Controle controle) {
        setCor(cor);
        this.controle = controle;
        this.ligado = false;
        this.multiplayer = false;
    }


    public Controle getControle() {
        return controle;
    }

    public void setControle(Controle controle) {
        this.controle = controle;
    }



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

    public void setCor(String cor) {
        if (cor == null || cor.isEmpty()) {
            System.out.println("Erro: cor inválida!");
        } else {
            this.cor = cor;
        }
    }

    public String getCor() {
        return cor;
    }
}