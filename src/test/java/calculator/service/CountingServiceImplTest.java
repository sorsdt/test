package calculator.service;

import calculator.domain.ComplexObject;
import org.junit.Assert;
import org.junit.Test;

public class CountingServiceImplTest {
    private CountingService service = new CountingServiceImpl();

    @Test
    public void add() throws Exception {
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expectedObject = new ComplexObject(4, 6);
        final ComplexObject result = service.add(objectA, objectB);
        Assert.assertEquals(expectedObject, result);
    }

    @Test
    public void substract() throws Exception {
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expectedObject = new ComplexObject(-2, -2);
        final ComplexObject result = service.substract(objectA, objectB);
        Assert.assertEquals(expectedObject, result);
    }

    @Test
    public void multiply() throws Exception {
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expectedObject = new ComplexObject(3, 8);
        final ComplexObject result = service.multiply(objectA, objectB);
        Assert.assertEquals(expectedObject, result);
    }

    @Test
    public void divide() throws Exception {
        ComplexObject objectA = new ComplexObject(1, 2);
        ComplexObject objectB = new ComplexObject(3, 4);
        ComplexObject expectedObject = new ComplexObject(0, 0);
        final ComplexObject result = service.divide(objectA, objectB);
        Assert.assertEquals(expectedObject, result);
    }
}