package br.edu.ifpb.universidade.teste;

import br.edu.ifpb.universidade.Professor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProfessor {
    @Test
    void professorDeveFuncionar(){
        Professor p1 = new Professor();
        assertEquals(480, p1.getSalario());
        assertEquals(0, p1.getHorasTrabalhadas());
        assertTrue(p1.setEndereco("Rua das Ostras"));
        p1.setHorasTrabalhadas(10);
        assertEquals(10, p1.getHorasTrabalhadas());
        assertEquals(480 + 10 * 100, p1.getSalario());
    }
}
