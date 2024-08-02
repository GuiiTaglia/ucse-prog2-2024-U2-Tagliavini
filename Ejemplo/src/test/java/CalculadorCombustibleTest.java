import org.example.AvionComercial;
import org.example.AvionPrivado;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadorCombustibleTest {

    CalculadorCombustible calculadorCombustible = CalculadorCombustible.getInstance();
    AvionPrivado avionPrivado = new AvionPrivado(60000, 60);
    AvionComercial avionComercial = new AvionComercial(60000,30);


    @Test
    void testGetInstance() {
        CalculadorCombustible calculadorCombustible2 = CalculadorCombustible.getInstance();
        Assertions.assertSame(calculadorCombustible, calculadorCombustible2);
    }

    @Test
    void testCalcularCombustibleAComercialDeberiaIgualar33000() {
        Assertions.assertEquals(calculadorCombustible.calcularCombustible(avionComercial, 1100), 33000);
    }

    @Test
    void testCalcularCombustibleAPrivadoDeberiaIgualar96000() {
        Assertions.assertEquals(calculadorCombustible.calcularCombustible(avionPrivado, 1100), 96000);
    }



}
