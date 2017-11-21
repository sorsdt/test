package calculator.service;

import java.util.concurrent.atomic.AtomicInteger;

public class StatisticServiceImpl implements StatisticService {
    private AtomicInteger add = new AtomicInteger(0);
    private AtomicInteger sub = new AtomicInteger(0);
    private AtomicInteger mul = new AtomicInteger(0);
    private AtomicInteger div = new AtomicInteger(0);

    @Override
    public int incAndGetAddCounter() {
        return add.incrementAndGet();
    }

    @Override
    public int incAndGetSubCounter() {
        return sub.incrementAndGet();
    }

    @Override
    public int incAndGetMultiplyCounter() {
        return mul.incrementAndGet();
    }

    @Override
    public int incAndGetDivideCounter() {
        return div.incrementAndGet();
    }
}
