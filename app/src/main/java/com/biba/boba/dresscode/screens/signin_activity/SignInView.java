package com.biba.boba.dresscode.screens.signin_activity;

public interface SignInView {
    void loadMainActivity();
    void loadForgotAccountActivity();
    void loadCreateAccActivity();
    void showErrorMessage(String error_message);
}
