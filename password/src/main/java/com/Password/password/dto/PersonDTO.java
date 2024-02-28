package com.Password.password.dto;
public class PersonDTO {
    private String firstName;
    private String middleName;
    private String lastName;

    // Generate getters and setters (omitted for brevity)

    @Override
    public String toString() {
        return "PersonDTO{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
