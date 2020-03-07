package br.edu.ifpb.universidade;

public class Professor extends Funcionário {
    private int horasTrabalhadas = 0;
    private final double taxaHorasTrabalhadas = 100.00;

    public Professor() {
        super();
    }

    public Professor(int horasTrabalhadas) {
        super();
        this.setHorasTrabalhadas(horasTrabalhadas);
    }

    @Override
    public String toString() {
        return super.toString() + "Horas trabalhadas: " + getHorasTrabalhadas();
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public boolean setHorasTrabalhadas(int horasTrabalhadas) {
        if(horasTrabalhadas > 0) {
            this.horasTrabalhadas = horasTrabalhadas;
            return true;
        }
        return false;
    }

    public double getTaxaHorasTrabalhadas() {
        return taxaHorasTrabalhadas;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + getHorasTrabalhadas() * getTaxaHorasTrabalhadas();
    }
}
