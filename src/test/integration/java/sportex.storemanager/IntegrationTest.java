package sportex.storemanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class IntegrationTest {

    private Integration integration;

    @BeforeEach
    void setUp() {
        integration = new Integration();
    }

    @Test
    void integration_test_works() {
        final var result = integration.value();
        assertThat(result).isEqualTo("integration");
    }

}