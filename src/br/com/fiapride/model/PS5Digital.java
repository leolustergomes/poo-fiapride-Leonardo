package br.com.fiapride.model;

public class PS5Digital extends Playstation_5 {

    private int armazenamentoDigital;

    public PS5Digital(String cor, Controle controle, int armazenamentoDigital) {
        super(cor, controle);
        this.armazenamentoDigital = armazenamentoDigital;
    }

    public int getArmazenamentoDigital() {
        return armazenamentoDigital;
    }

    public void setArmazenamentoDigital(int armazenamentoDigital) {
        if (armazenamentoDigital > 0) {
            this.armazenamentoDigital = armazenamentoDigital;
        }
    }

    public double calcularConsumoEnergia() {
        return 200.0;
    }
}