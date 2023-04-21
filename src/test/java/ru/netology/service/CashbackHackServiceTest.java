package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    @Test
    public void testRemainOutputNumberLessThousand() {

            int amount = 700;
            int expected = 300;

            CashbackHackService service = new CashbackHackService();
            int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
        }

    @Test
    public void testRemainOutputNumberOverThousand() {
        int amount = 5500;
        int expected = 500;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainBoundaryRight() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainBoundaryLeft() {
        int amount = 0;
        int expected = 1000;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainNearBoundaryLeft() {
        int amount = 1;
        int expected = 999;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainNearBoundaryRight1() {
        int amount = 1001;
        int expected = 999;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainNearBoundaryRight2() {
        int amount = 999;
        int expected = 1;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

}