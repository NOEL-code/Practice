package org.example.jpa.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {

    private String street;
    private String city;
    private String zipCode;
}
