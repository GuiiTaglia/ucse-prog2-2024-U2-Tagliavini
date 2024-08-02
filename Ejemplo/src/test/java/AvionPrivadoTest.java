import org.example.AvionPrivado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionPrivadoTest {

    AvionPrivado avionPrivado = new AvionPrivado(60000, 60);

    @Test
    void testVolarDeberiaIgualar96000() {
        Assertions.assertEquals(96000, avionPrivado.volar(1100));
    }
    @Test
    void testGetCombustibleDeberiaIgualar60() {
        Assertions.assertEquals(60, avionPrivado.getConsumoCombustible());
    }
}
