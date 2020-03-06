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
        Log.i("dressLog", "on click");
       switch (v.getId())
        {
            case R.id.sign_in:
                Log.i("dressLog", "on sign in");
                signInView.loadMainActivity();
                break;

            case R.id.sign_out:
                Log.i("dressLog", "on sign out");
                signInView.loadCreateAccActivity();
                break;

            case R.id.forgot_account:
                Log.i("dressLog", "on forgot");
                signInView.loadForgotAccountActivity();
                break;

        }

    }

}
