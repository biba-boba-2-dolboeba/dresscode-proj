package com.biba.boba.dresscode.dataСhecking;

import java.util.regex.Pattern;

public interface DataChecking
{
    Pattern PASSWORD = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}");
    Pattern EMAIL = Pattern.compile( "[a-zA-Z0-9+._%\\-+]{4,256}@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})");
    Pattern NAME = Pattern.compile("([a-zA-z]{0,20})([0-9]{0,20})(\\S){4,}");

    boolean checkName(String name);
    boolean checkEmail(String email);
    boolean checkPassword(String password);
}
