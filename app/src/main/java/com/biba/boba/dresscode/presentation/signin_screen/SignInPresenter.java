package com.biba.boba.dresscode.presentation.signin_screen;

import android.util.Log;
import android.view.View;

import com.biba.boba.dresscode.R;

public class SignInPresenter implements View.OnClickListener
{
    private final SignInView signInView;


    SignInPresenter(SignInView signInView)
    {
        this.signInView = signInView;
    }

    boolean checkValidData(String login, String pass)
    {
        if (login.equals("") || pass.equals(""))
        {
            signInView.showMessage("invalid data");
            return false;
        }
        else {
            signInView.showMessage("");
            return true;
        }
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.sign_in_button :
                Log.d("dressLog", "triggered sign_in");
                signInView.loadMainActivity();
                break;

            case R.id.forgot_account:
                Log.d("dressLog", "triggered forgot_account");
                signInView.loadForgotAccountActivity();
                break;

        }

    }

}
