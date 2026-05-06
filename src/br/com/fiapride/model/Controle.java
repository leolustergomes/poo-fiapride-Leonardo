package br.com.fiapride.model;

public class Controle implements Conectavel {

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

    public void conectarInternet() {
        System.out.println("Controle conectado via Bluetooth");
    }

    public void desconectarInternet() {
        System.out.println("Controle desconectado");
    }
}