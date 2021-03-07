package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTests {
    @Test
    public void sumPositiveValues() {
        Assertions.assertEquals(15, Example.sum(5, 10));
    }

    @Test
    public void sumNegativeValues() {
        Assertions.assertEquals(-10, Example.sum(-7, -3));
    }
}
