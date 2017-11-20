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
        //Given
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expectedObject = new ComplexObject(-2, -2);
        //When
        final ComplexObject result = service.substract(objectA, objectB);
        //Result
        Assert.assertEquals(expectedObject, result);
    }

    @Test
    public void multiply() throws Exception {
        //Given
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expectedObject = new ComplexObject(3, 8);
        //When
        final ComplexObject result = service.multiply(objectA, objectB);
        //Result
        Assert.assertEquals(expectedObject, result);
    }

    @Test
    public void divide() throws Exception {
        //Given
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expectedObject = new ComplexObject(0, 0);
        //When
        final ComplexObject result = service.divide(objectA, objectB);
        //Result
        Assert.assertEquals(expectedObject, result);
    }

}