package com.furqonfadlillah.resetpasswordapplication.entity;

import com.furqonfadlillah.resetpasswordapplication.validator.PasswordConfirmation;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@PasswordConfirmation(
        password = "password",
        confirmPassword = "confirmPassword",
        message = "PASSWORDS_NOT_EQUAL"
)
public class PasswordReset {
    @NotEmpty
    private String password;
    @NotEmpty
    private String confirmPassword;
    @NotEmpty
    private String token;
}
