package silva.sousa.hercules;

public class calculadora {
    private String descricao = "Calculadora simples na versão 1.0";
    private double memoria;

    public double somar(double[] numeros){
        return numeros[0] + numeros[1];
    }

    public double subtrair(double[] numeros){
        return numeros[0] - numeros[1];
    }

    public double multiplicar(double[] numeros){
        return numeros[0] * numeros[1];
    }

    public double dividir(double[] numeros){
        return numeros[0] / numeros[1];
    }

    public void setMemoria(double m) {
        memoria = m;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setDescricao(String d) {
        descricao = d;
    }

    public String getDescricao() {
        return descricao;
    }
}
