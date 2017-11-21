package calculator.service;

import calculator.domain.ComplexObject;

public class ValidationServiceThird implements ValidationService {
    @Override
    public void validate(ComplexObject param) {
        if (param == null) throw new IllegalArgumentException("param is null");
        if (param.getService() == null) throw new IllegalArgumentException("service is null");
        if (!((param.getValueA() == -100) || (param.getValueA() == 50))) {
            throw new IllegalArgumentException("valueA neither -100 or 50");
        }
        if (param.getValueB() >= 0) throw new IllegalArgumentException("valueB is bigger then 0");
    }
}