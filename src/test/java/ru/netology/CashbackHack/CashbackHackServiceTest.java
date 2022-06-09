package ru.netology.CashbackHack;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void ShouldReturn1000WhenBuy0 () {
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }
    @Test
    public void ShouldReturn0WhenBuy1000 () {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldReturn999whenBuy1() {
        int expected = 999;
        int actual = service.remain(1);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500whenBuy500() {
        int expected = 500;
        int actual = service.remain(500);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1whenBuy999() {
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnLimitWhenBuyMoreLimit() {
        int expected = 1000;
        int actual = service.remain(3000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0WhenBuyIsNegative() {
        int expected = 1001;
        int actual = service.remain(-1);
        assertEquals(actual, expected);
    }

}