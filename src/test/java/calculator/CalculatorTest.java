package calculator;

import calculator.domain.ComplexObject;
import calculator.service.CountingService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    private CountingService countingService;

    @InjectMocks
    private Calculator calculator;

    @Test
    public void addTest() {
        //Given
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expectedResult = new ComplexObject(0, 0);
        when(countingService.add(objectA, objectB)).thenReturn(expectedResult);
        //When
        ComplexObject result = calculator.add(objectA, objectB);
        //Then
        Assert.assertEquals(expectedResult, result);
        verify(countingService, times(1)).add(objectA, objectB);
//        reset(countingService);//without annotation
    }
}