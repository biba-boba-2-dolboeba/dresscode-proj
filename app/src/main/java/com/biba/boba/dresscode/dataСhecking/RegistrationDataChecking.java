package com.biba.boba.dresscode.dataСhecking;

public class RegistrationDataChecking implements DataChecking
{
    @Override
    public boolean checkEmail(String email)
    {
        //отправка запроса на сравнения email
        return EMAIL.matcher(email).matches();
    }

    @Override
    public boolean checkPassword(String password)
    {
        return PASSWORD.matcher(password).matches();
    }

    @Override
    public boolean checkName(String name)
    {
        //отправка запроса на сравнения name
        return NAME.matcher(name).matches();
    }

    public boolean checkMatchPassword(String password, String repeatPassword)
    {
        return password.equals(repeatPassword);
    }



}
