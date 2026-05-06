package br.com.fiapride.model;

public class Controle {

    private int nivelBateria;
    private String cor;

    public Controle(int nivelBateria, String cor) {
        setNivelBateria(nivelBateria);
        setCor(cor);
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
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
}