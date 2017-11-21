package calculator;

import calculator.domain.ComplexObject;
import calculator.service.CountingService;
import calculator.service.StatisticService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    private ComplexObject objectA = new ComplexObject(1, 2);
    private ComplexObject objectB = new ComplexObject(3, 4);
    private ComplexObject expectedResult = new ComplexObject(0, 0);

    @Mock
    private CountingService countingService;
    @Mock
    private StatisticService statisticService;

    @InjectMocks
    private Calculator calculator = new Calculator(countingService, statisticService);

    @Test
    public void addTest(){
        Mockito.when(countingService.add(objectA, objectB)).thenReturn(expectedResult);
        ComplexObject result = calculator.add(objectA, objectB);
        Assert.assertEquals(expectedResult, result);
        Mockito.verify(countingService).add(objectA,objectB);
        Mockito.verify(statisticService).incAndGetAddCounter();
    }

    @Test
    public void substract() throws Exception {
        Mockito.when(countingService.substract(objectA, objectB)).thenReturn(expectedResult);
        ComplexObject result = calculator.substract(objectA, objectB);
        Assert.assertEquals(expectedResult, result);
        Mockito.verify(countingService).substract(objectA,objectB);
        Mockito.verify(statisticService).incAndGetSubCounter();
    }

    @Test
    public void multiply() throws Exception {
        Mockito.when(countingService.multiply(objectA, objectB)).thenReturn(expectedResult);
        ComplexObject result = calculator.multiply(objectA, objectB);
        Assert.assertEquals(expectedResult, result);
        Mockito.verify(countingService).multiply(objectA,objectB);
        Mockito.verify(statisticService).incAndGetMultiplyCounter();
    }

    @Test
    public void divide() throws Exception {
        Mockito.when(countingService.divide(objectA, objectB)).thenReturn(expectedResult);
        ComplexObject result = calculator.divide(objectA, objectB);
        Assert.assertEquals(expectedResult, result);
        Mockito.verify(countingService).divide(objectA,objectB);
        Mockito.verify(statisticService).incAndGetDivideCounter();
    }
}