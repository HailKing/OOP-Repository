package br.edu.ifpb.universidade;

import java.util.ArrayList;

public class Universidade {
    private ArrayList<Funcionário> arr = new ArrayList<Funcionário>();

    public Universidade() {
    }

    public ArrayList<Funcionário> getArr() {
        return arr;
    }

    public boolean addFuncionario(){
        Funcionário f = new Funcionário();
        arr.add(f);
        return true;
    }

    public boolean addFuncionario(int matricula, int idade, String endereco, double salario){
        if(buscarFuncionario(matricula)) return false;
        Funcionário f = new Funcionário(matricula, idade, endereco, salario);
        arr.add(f);
        return true;
    }

    public boolean buscarFuncionario(int matricula){
        for(Funcionário c: arr){
            return c.getMatricula() == matricula;
        }
        return false;
    }

    public boolean removeFuncionario(int matricula){
        return this.arr.removeIf(Funcionário -> Funcionário.getMatricula() == matricula);
    }

    @Override
    public String toString() {
        return "Universidade{" +
                "arr = " + arr +
                '}';
    }
}
