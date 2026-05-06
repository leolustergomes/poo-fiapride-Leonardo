package br.com.fiapride.model;

public class PS5MidiaFisica extends Playstation_5 {

    private boolean possuiLeitorDisco;

    public PS5MidiaFisica(String cor, Controle controle, boolean possuiLeitorDisco) {
        super(cor, controle);
        this.possuiLeitorDisco = possuiLeitorDisco;
    }

    public boolean isPossuiLeitorDisco() {
        return possuiLeitorDisco;
    }

    public void setPossuiLeitorDisco(boolean possuiLeitorDisco) {
        this.possuiLeitorDisco = possuiLeitorDisco;
    }
}