package calculator;

import calculator.domain.ComplexObject;
import calculator.domain.Service;
import calculator.service.*;

import java.util.HashMap;
import java.util.Map;

class Calculator {
    private Map<Service, ValidationService> validationServiceMap = new HashMap<>();
    private CountingService countingService;
    private StatisticService statisticService;

    public Calculator(CountingService countingService, StatisticService statisticService) {
        this.countingService = countingService;
        this.statisticService = statisticService;

        validationServiceMap.put(Service.FIRST, new ValidationServiceFirst());
        validationServiceMap.put(Service.SECOND, new ValidationServiceSecond());
        validationServiceMap.put(Service.THIRD, new ValidationServiceThird());
    }

    ComplexObject add(ComplexObject param1, ComplexObject param2) {
        statisticService.incAndGetAddCounter();
        validate(param1, param2);
        return countingService.add(param1, param2);
    }

    ComplexObject substract(ComplexObject param1, ComplexObject param2) {
        statisticService.incAndGetSubCounter();
        validate(param1, param2);
        return countingService.substract(param1, param2);
    }

    ComplexObject multiply(ComplexObject param1, ComplexObject param2) {
        statisticService.incAndGetMultiplyCounter();
        validate(param1, param2);
        return countingService.multiply(param1, param2);
    }

    ComplexObject divide(ComplexObject param1, ComplexObject param2) {
        statisticService.incAndGetDivideCounter();
        validate(param1, param2);
        return countingService.divide(param1, param2);
    }

    private void validate(ComplexObject param1, ComplexObject param2) {
        if ((param1 == null) && (param2 == null)) {
            throw new IllegalArgumentException("params are null");
        } else if (param1 == null) {
            throw new IllegalArgumentException("param1 is null");
        } else if (param2 == null) {
            throw new IllegalArgumentException("param2 is null");
        }
        if (param1.getService() != param2.getService()) {
            throw new IllegalArgumentException("Services must be equal !!!");
        }

        ValidationService validationService = validationServiceMap.get(param1.getService());
        validationService.validate(param1);
        validationService.validate(param2);
    }
}
