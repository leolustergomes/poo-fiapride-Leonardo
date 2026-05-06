package br.com.fiapride.model;

public abstract class Playstation_5 implements Conectavel {

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

    public void ligar() {
        if (!ligado) {
            ligado = true;
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor != null && !cor.isEmpty()) {
            this.cor = cor;
        }
    }

    public Controle getControle() {
        return controle;
    }

    public void setControle(Controle controle) {
        this.controle = controle;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public void conectarInternet() {
        System.out.println("PS5 conectado à internet");
    }

    public void desconectarInternet() {
        System.out.println("PS5 desconectado da internet");
    }

    public abstract double calcularConsumoEnergia();
}