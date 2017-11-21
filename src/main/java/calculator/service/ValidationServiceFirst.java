package calculator.service;

import calculator.domain.ComplexObject;

public class ValidationServiceFirst implements ValidationService {
    @Override
    public void validate(ComplexObject param) {
        if (param == null) throw new IllegalArgumentException("param is null");
        if (param.getService() == null) throw new IllegalArgumentException("service is null");
    }
}
