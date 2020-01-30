package lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Tests {
    @Test
    public void sum_positiveValues_calculated() {
        Assertions.assertEquals(15, Task1.sum(5, 10));
    }

    @Test
    public void sum_negativeValues_calculated() {
        Assertions.assertEquals(-10, Task1.sum(-7, -3));
    }
}
