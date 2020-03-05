package br.edu.ifpb.conta;
import java.util.Date;

public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo = 0;
    private String extrato = "";

    public int getNumero() {
        Date date = java.util.Calendar.getInstance().getTime();
        extrato += (date + ": Consulta do número\n");
        return numero;
    }

    public boolean setNumero(int numero) {
        if(numero > 0) {
            this.numero = numero;
            Date date = java.util.Calendar.getInstance().getTime();
            extrato += (date + ": Setando o número da conta\n");
            return true;
        }
        return false;
    }

    public String getTitular() {
        Date date = java.util.Calendar.getInstance().getTime();
        extrato += (date + ": Consulta do titular\n");
        return titular;
    }

    public boolean setTitular(String titular) {
        if(!titular.isEmpty()){
            if(!titular.isBlank()){
                this.titular = titular;
                Date date = java.util.Calendar.getInstance().getTime();
                extrato += (date + ": Setando o titular\n");
                return true;
            }
        }
        return false;
    }

    public double getSaldo() {
        Date date = java.util.Calendar.getInstance().getTime();
        extrato += (date + ": Consulta do saldo\n");
        return saldo;
    }

    public ContaCorrente(int novoNumero, String novoTitular, double saldoInicial){
        Date date = java.util.Calendar.getInstance().getTime();
        extrato += (date + ": Criação da conta\n");
        this.setNumero(novoNumero);
        this.setTitular(novoTitular);
        this.depositar(saldoInicial);
    }

    public boolean depositar(double quantia){
        if(quantia > 0){
            Date date = java.util.Calendar.getInstance().getTime();
            extrato += (date + ": Depósito no valor de R$" + quantia + "\n");
            saldo += quantia;
            return true;
        }
        return false;
    }

    public boolean saque(double quantia){
        if(quantia + this.calculaCPMF(quantia) <= saldo){
            saldo -= quantia;
            this.descontaCPMF(this.calculaCPMF(quantia));
            Date date = java.util.Calendar.getInstance().getTime();
            String texto = String.format(": Saque no valor de R$%.2f com taxa de R$%.2f totalizando R$%.2f\n", quantia, this.calculaCPMF(quantia), (quantia + this.calculaCPMF(quantia)));
            extrato += (date + texto);
            return true;
        }
        return false;
    }

    public String getExtrato() {
        return extrato;
    }

    public double calculaCPMF(double quantia){
        return quantia * 0.01;
    }

    public void descontaCPMF(double CPMF){
        saldo -= CPMF;
    }

}
