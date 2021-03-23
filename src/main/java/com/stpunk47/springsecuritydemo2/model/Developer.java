package com.stpunk47.springsecuritydemo2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {

    private Long id;
    private String firstName;
    private String lastName;
}
