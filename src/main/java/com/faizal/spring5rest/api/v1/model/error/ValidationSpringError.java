package com.faizal.spring5rest.api.v1.model.error;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class ValidationSpringError {
    private final String errorMessage;
    private List<String> errors = new ArrayList<>();
}
