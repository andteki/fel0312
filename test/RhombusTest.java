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
    @Test
    void calcRadiusOneTest() {
        double side = 1;
        double alpha = 1;
        double expectedRadius = 0.0087;

        double actualRadius = this.rhombus.calcRadius(side, alpha);

        assertEquals(expectedRadius, actualRadius, 0.0001);
    }
    @Test
    void calcRadiusTopAngleTest() {
        double side = 30;
        double alpha = 179;
        double expectedRadius = 0.26;

        double actualRadius = this.rhombus.calcRadius(side, alpha);

        assertEquals(expectedRadius, actualRadius, 0.01);
    }


}
