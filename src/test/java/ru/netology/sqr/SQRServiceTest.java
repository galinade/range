package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void shouldCalcAmountSquaresRange() {
        SQRService service = new SQRService();
        int actual = service.crazyCant(100, 4000);
        int expected = 54;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountSquaresRangeZero() {
        SQRService service = new SQRService();
        int actual = service.crazyCant(10, 50);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}