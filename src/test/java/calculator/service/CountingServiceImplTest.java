package calculator.service;

import calculator.domain.ComplexObject;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountingServiceImplTest {
    private CountingService service = new CountingServiceImpl();

    @Test
    public void add() throws Exception {
        //Given
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expectedObject = new ComplexObject(4, 6);
        //When
        final ComplexObject result = service.add(objectA, objectB);
        //Result
        Assert.assertEquals(expectedObject, result);
    }

    @Test
    public void substract() throws Exception {
    }

    @Test
    public void multiply() throws Exception {
    }

    @Test
    public void divide() throws Exception {
    }

}