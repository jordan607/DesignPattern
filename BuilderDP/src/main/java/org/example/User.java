package org.example;

import lombok.Builder;

@Builder
public class User {
    private int id;
    private String firstName;
    private String lastName;

    private String address;
}
