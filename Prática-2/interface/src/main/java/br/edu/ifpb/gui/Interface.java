package br.edu.ifpb.gui;

import br.edu.ifpb.livro.CatalogoLivros;
import br.edu.ifpb.livro.Livro;

public class Interface {
    public static void main(String[] args) {

        Livro l1 = new Livro(10, "O Senhor dos Anéis");

        Livro l2 = new Livro(11, "A fúria dos reis");

        Livro l3 = new Livro(12, "A guerra dos tronos");

        System.out.printf("Usando o metodo getTitulo, título = %s\n", l1.getTitulo());
        System.out.printf("Usando o metodo getID, ID = %s\n", l1.getId());

        CatalogoLivros c1 = new CatalogoLivros();

        c1.adicionarLivro(l1);
        c1.adicionarLivro(l2);
        c1.adicionarLivro(l3);

        System.out.println("\nPrintando toda a lista:");
        System.out.println(c1.toString());

        c1.removerLivro(10);

        System.out.println("\nRemovendo o livro com ID 10:");
        System.out.println(c1.toString());

        System.out.println("\nProcurando o livro com ID 10:");
        System.out.println(c1.buscarLivro(10));

        System.out.println("\nProcurando o livro com ID 11:");
        System.out.println(c1.buscarLivro(11));
    }
}
