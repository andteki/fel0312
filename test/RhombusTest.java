import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class RhombusTest {
    Rhombus rhombus;
    @BeforeEach
    void setUp() {
        this.rhombus = new Rhombus();
    }

    @Test
    void calcRadiusTest() {
        double side = 30;
        double alpha = 35;
        double expectedRadius = 8.60;

        double actualRadius = this.rhombus.calcRadius(side, alpha);

        assertEquals(expectedRadius, actualRadius, 0.01);
    }
    @Test
    void calcRadiusAnotherTest() {
        double side = 120;
        double alpha = 40;
        double expectedRadius = 38.56;

        double actualRadius = this.rhombus.calcRadius(side, alpha);

        assertEquals(expectedRadius, actualRadius, 0.01);
    }
}
