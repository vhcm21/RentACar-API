package com.school.mindera.rentacar.command;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Builder
public class CreateUserDto {

    @NotBlank(message = "Must have first name")
    private String firstName;

    @NotBlank(message = "Must have last name")
    private String lastName;

    @NotBlank(message = "Must have license ID")
    private String licenseId;

    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Must have password")
    private String password;
}
