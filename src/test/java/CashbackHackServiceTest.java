package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
     CashbackHackService = new CashbackHackService();

    @Test
    public void shouldRemain1000IfAmountIs0() {

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain400IfAmountIs600() {

        int amount = 600;
        int expected = 400;
        int actual = service.remain(600);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain100IfAmountIs900() {

        int amount = 900;
        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain0IfAmountIs1000() {

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }
}