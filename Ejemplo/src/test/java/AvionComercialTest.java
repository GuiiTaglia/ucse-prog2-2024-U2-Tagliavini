import org.example.AvionComercial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionComercialTest {

    AvionComercial avionComercial = new AvionComercial(60000,30);

    @Test
    public void testVolarDeberiaIgualar33000() {
        Assertions.assertEquals(33000,avionComercial.volar(1100));
    }
}
