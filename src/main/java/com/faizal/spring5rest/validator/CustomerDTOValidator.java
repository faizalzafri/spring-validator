package com.faizal.spring5rest.validator;

import com.faizal.spring5rest.api.v1.model.CustomerDTO;
import com.faizal.spring5rest.exceptions.NotValidException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomerDTOValidator {

    public void validate(CustomerDTO customerDTO) {

        //someLogic to validate object
        Optional<String> firstname = Optional.ofNullable(customerDTO.getFirstname());

        if (!firstname.isPresent())
            throw new NotValidException("Testing Validator");

    }
}
