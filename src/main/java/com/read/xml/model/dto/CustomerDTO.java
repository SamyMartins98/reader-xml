package com.read.xml.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CustomerDTO {
    private String firstName;
    private String lastName;
    private LocalDateTime birthdate;
}
