package br.edu.ifpb.universidade.teste;

import br.edu.ifpb.universidade.Universidade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUniversidade {
    @Test
    void universidadeDeveFuncionar(){
        Universidade u1 = new Universidade();
        u1.addFuncionario();
        assertEquals(1, u1.getArr().size());
        Universidade u2 = new Universidade();
        u2.addFuncionario(5, 26, "Rua A", 900);
        assertFalse(u2.addFuncionario(5, 80, "Rua B", 100));
        assertTrue(u2.buscarFuncionario(5));
        assertFalse(u2.buscarFuncionario(40));
        assertTrue(u2.removeFuncionario(5));
        assertFalse(u2.removeFuncionario(800));
    }
}
