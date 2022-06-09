package ru.netology.CashbackHack;

import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.jupiter.api.Test
    public void shouldReturn1000whenBuy0() {
        int expected = 1000;
        int actual = service.remain(0);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn999whenBuy1() {
        int expected = 999;
        int actual = service.remain(1);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn500whenBuy500() {
        int expected = 500;
        int actual = service.remain(500);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn1whenBuy999() {
        int expected = 1;
        int actual = service.remain(999);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnLimitWhenBuyMoreLimit() {
        int expected = 1000;
        int actual = service.remain(3000);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn0WhenBuy1000() {
        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn0WhenBuyIsNegative() {
        int expected = 1001;
        int actual = service.remain(-1);
        Assertions.assertEquals(expected, actual);
    }
}