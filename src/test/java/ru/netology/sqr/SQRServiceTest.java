package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCountNumbersSQR1(){
        SQRService service = new SQRService();
        int actual = service.countSquareRoot(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldCountNumbersSQR2() {
        SQRService service = new SQRService();
        int actual = service.countSquareRoot(1, 300);
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldCountNumbersSQR3() {
        SQRService service = new SQRService();
        int actual = service.countSquareRoot(300, 300);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldCountNumbersSQR4() {
        SQRService service = new SQRService();
        int actual = service.countSquareRoot(300, 0);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountNumbersSQR5() {
        SQRService service = new SQRService();
        int actual = service.countSquareRoot(0, 0);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountNumbersSQR6() {
        SQRService service = new SQRService();
        int actual = service.countSquareRoot(-200, 0);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountNumbersSQR7() {
        SQRService service = new SQRService();
        int actual = service.countSquareRoot(-200, -300);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountNumbersSQR8() {
        SQRService service = new SQRService();
        int actual = service.countSquareRoot(999, 99999);
        int expected = 68;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldCountNumbersSQR9() {
        SQRService service = new SQRService();
        int actual = service.countSquareRoot(100_000, 1_000_000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldCountNumbersSQR10() {
        SQRService service = new SQRService();
        int actual = service.countSquareRoot(10_000_000, 10_000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

}

