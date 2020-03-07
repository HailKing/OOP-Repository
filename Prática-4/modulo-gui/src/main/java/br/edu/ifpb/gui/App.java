package br.edu.ifpb.gui;

import br.edu.ifpb.universidade.Universidade;

public class App {
    public static void main(String[] args) {
        Universidade u = new Universidade();
        u.addFuncionario(1, 25, "Rua dos Alfeneiros", 1200);
        System.out.println(u.toString());
    }
}
