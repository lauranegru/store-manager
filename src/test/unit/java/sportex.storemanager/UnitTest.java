package sportex.storemanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UnitTest {

    private Unit unit;

    @BeforeEach
    void setUp() {
        unit = new Unit();
    }

    @Test
    void unit_test_works() {
        final var result = unit.value();
        assertThat(result).isEqualTo("unit");
    }

}