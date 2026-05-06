package br.com.fiapride.model;

public class Controle {

    private int nivelBateria; // 0 a 100
    private String cor;

    // Construtor
    public Controle(int nivelBateria, String cor) {
        setNivelBateria(nivelBateria);
        setCor(cor);
    }

    // Getter e Setter com validação
    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria < 0 || nivelBateria > 100) {
            System.out.println("Erro: bateria inválida!");
        } else {
            this.nivelBateria = nivelBateria;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.isEmpty()) {
            System.out.println("Erro: cor inválida!");
        } else {
            this.cor = cor;
        }
    }
}