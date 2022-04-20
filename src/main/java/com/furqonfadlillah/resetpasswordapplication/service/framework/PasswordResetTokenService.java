package com.furqonfadlillah.resetpasswordapplication.service.framework;

import com.furqonfadlillah.resetpasswordapplication.entity.PasswordResetToken;


public interface PasswordResetTokenService {
    PasswordResetToken findByToken(String token);

    PasswordResetToken save(PasswordResetToken passwordResetToken);
}
