package br.edu.ifpb.universidade.teste;

import static org.junit.jupiter.api.Assertions.*;

import br.edu.ifpb.universidade.Funcionário;
import org.junit.jupiter.api.Test;

class TesteFuncionário {
    @Test
    void funcionarioDeveFuncionar(){
        Funcionário f1 = new Funcionário();
        assertEquals(480.00, f1.getSalario());
        assertEquals("--- Sem endereço ---", f1.getEndereco());
        assertFalse(f1.setIdade(-10));

        Funcionário f2 = new Funcionário(10, 25, "Rua dos Alfeneiros", 800.00);
        assertEquals(25, f2.getIdade());
        assertEquals(800, f2.getSalario());
        f2.setSalario(1200);
        assertEquals(1200, f2.getSalario());
    }

}
