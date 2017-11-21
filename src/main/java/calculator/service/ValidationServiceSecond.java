package calculator.service;

import calculator.domain.ComplexObject;

public class ValidationServiceSecond implements ValidationService {
    @Override
    public void validate(ComplexObject param) {
        if (param == null) throw new IllegalArgumentException("param is null");
        if (param.getService() == null) throw new IllegalArgumentException("service is null");
        if (param.getValueA() < 0) throw new IllegalArgumentException("valueA is less then 0");
        if (param.getValueB() < 0) throw new IllegalArgumentException("valueB is less then 0");
    }
}
