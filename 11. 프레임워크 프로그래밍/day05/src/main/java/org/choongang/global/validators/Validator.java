package org.choongang.global.validators;

import org.springframework.validation.Errors;

public interface Validator<T> {
    boolean supports(Class<?> clazz);

    void validate(Object target, Errors errors);

    void check(T form);
}
