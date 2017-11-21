package calculator.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class StatisticServiceImplTest {
    StatisticServiceImpl statisticService = new StatisticServiceImpl();

    @Test
    public void incrementAndGetAddCounter() throws Exception {
        assertEquals(statisticService.incAndGetAddCounter(),1);
        assertEquals(statisticService.incAndGetAddCounter(),2);
    }

    @Test
    public void incrementAndGetSubCounter() throws Exception {
        assertEquals(statisticService.incAndGetSubCounter(),1);
        assertEquals(statisticService.incAndGetSubCounter(),2);
    }

    @Test
    public void incrementAndGetMultiplyCounter() throws Exception {
        assertEquals(statisticService.incAndGetMultiplyCounter(),1);
        assertEquals(statisticService.incAndGetMultiplyCounter(),2);
    }

    @Test
    public void incrementAndGetDivideCounter() throws Exception {
        assertEquals(statisticService.incAndGetDivideCounter(),1);
        assertEquals(statisticService.incAndGetDivideCounter(),2);
    }
}