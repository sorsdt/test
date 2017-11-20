package calculator.domain;

import calculator.service.AppleValidationServiceImpl;
import calculator.service.ValidationService;

public enum Service {
    APPLE {{
            this.validationService = new AppleValidationServiceImpl();
        }},
    ORANGE {{
        this.validationService = new OrangeValidationServiceImpl();
    }},
    CARROT{{
        this.validationService = new CarrotValidationServiceImpl();
    }};

    private ValidationService validationService;

    public ValidationService getValidationService() {
        return validationService;
    }

}