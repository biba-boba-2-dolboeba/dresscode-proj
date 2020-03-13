package com.biba.boba.dresscode.dataСhecking;

import java.util.regex.Pattern;

public class DataChecking
{
    //заходит при колличестве символов меньше 8
    private final Pattern PASSWORD = Pattern.compile("(?=.*[A-Z])([a-z]{0,})([0-9]{0,})([@#$%^&+=]{0,})(\\S){8,}");
    private final Pattern EMAIL = Pattern.compile( "[a-zA-Z0-9+._%\\-+]{4,256}@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})");
    //заходит при колличестве символов меньше 4
    private final Pattern NAME = Pattern.compile("([a-zA-z]{0,})([0-9]{0,})([@#$%^&+=]{0,})(\\S){4,}");


    public boolean checkEmail(String email)
    {
        return EMAIL.matcher(email).matches();
    }

    public boolean checkPassword(String password)
    {
        return PASSWORD.matcher(password).matches();
    }

    public boolean checkName(String name)
    {
        return NAME.matcher(name).matches();
    }

    public boolean checkMatchPassword(String password, String repeatPassword)
    {
        return password.equals(repeatPassword);
    }



}
