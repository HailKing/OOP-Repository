package br.edu.ifpb.livro;

import br.edu.ifpb.livro.Livro;
import java.util.Arrays;
import  java.util.ArrayList;
import java.util.Iterator;

public class CatalogoLivros {
    private ArrayList<Livro> list = new ArrayList<>();
    private int quantidade = 0;


    public CatalogoLivros() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean adicionarLivro(Livro l){
        if(!this.buscarLivro(l.getId())) {
            list.add(l);
            quantidade += 1;
            return true;
        }
        return false;
    }

    public boolean removerLivro(int id){
        if (getQuantidade() > 0) {
            boolean a = list.removeIf(livro -> livro.getId() == id);
            if(a) quantidade -= 1;
            return a;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CatalogoLivros{" +
                "list = " + list +
                ", quantidade = " + quantidade +
                '}';
    }

    public boolean buscarLivro(int id){
        for(int i = 0; i < getQuantidade(); i++){
            if(list.get(i).getId() == id) return true;
        }
        return false;
    }
}
