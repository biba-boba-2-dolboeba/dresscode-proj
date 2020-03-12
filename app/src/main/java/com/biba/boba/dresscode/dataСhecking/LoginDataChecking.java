package com.biba.boba.dresscode.dataСhecking;

public class LoginDataChecking implements DataChecking
{
    @Override
    public boolean checkName(String name)
    {
        //отправляем запрос на сервер
        return NAME.matcher(name).matches();
    }

    @Override
    public boolean checkEmail(String email)
    {
        //отправляем запрос на сервер
        return EMAIL.matcher(email).matches();
    }

    @Override
    public boolean checkPassword(String password)
    {
        //отправляем запрос на сервер
        return PASSWORD.matcher(password).matches();
    }
}
