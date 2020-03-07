package com.biba.boba.dresscode.presentation.signin_screen;

public interface SignInView {
    void loadMainActivity();
    void loadForgotAccountActivity();
    void loadCreateAccActivity();
    void showErrorMessage(String error_message);
}
