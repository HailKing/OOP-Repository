package br.edu.ifpb.universidade;

public class Funcionário {
    private int matricula;
    private int idade;
    private String endereco;
    private double salario;

    public Funcionário(int matricula, int idade, String endereco, double salario) {
        this.setMatricula(matricula);
        this.setIdade(idade);
        this.setEndereco(endereco);
        this.setSalario(salario);
    }

    public Funcionário() {
        this.setMatricula(0);
        this.setIdade(0);
        this.setEndereco("--- Sem endereço ---");
        this.setSalario(480.00);
    }

    public int getMatricula() {
        return matricula;
    }

    public boolean setMatricula(int matricula) {
        if (matricula >= 0) {
            this.matricula = matricula;
            return true;
        }
        return false;
    }

    public int getIdade() {
        return idade;
    }

    public boolean setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
            return true;
        }
        return false;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean setEndereco(String endereco) {
        if (!endereco.isEmpty()) {
            if (!endereco.isBlank()) {
                this.endereco = endereco;
                return true;
            }
        }
        return false;
    }

    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "matricula = " + matricula +
                ", idade = " + idade +
                ", endereco = '" + endereco + '\'' +
                ", salario = " + salario;
    }
}
