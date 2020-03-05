import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
    @Test
    void sumShouldWork(){
        Calculadora c1 = new Calculadora();
        assertEquals(9, c1.soma(5, 4));
    }
}