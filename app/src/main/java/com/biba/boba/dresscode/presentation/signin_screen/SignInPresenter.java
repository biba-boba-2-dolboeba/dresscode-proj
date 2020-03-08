package com.biba.boba.dresscode.presentation.signin_screen;

import android.util.Log;
import android.view.View;

import com.biba.boba.dresscode.R;

public class SignInPresenter implements View.OnClickListener
{
    private SignInView signInView;


    SignInPresenter(SignInView signInView)
    {
        this.signInView = signInView;
    }

    boolean isValidData(String login, String pass)
    {
        if (login.equals("") || pass.equals(""))
        {
            signInView.showErrorMessage("invalid data");
            return false;
        }

        signInView.showErrorMessage("");
        return true;
    }


    @Override
    public void onClick(View v)
    {
        Log.i("dressLog", "on click");
       switch (v.getId())
        {
            case R.id.sign_in_button:
                Log.i("dressLog", "on sign in");
                signInView.loadMainActivity();
                break;

            case R.id.sign_out_button:
                Log.i("dressLog", "on sign out");
                signInView.loadCreateAccActivity();
                break;

            case R.id.forgot_account_button:
                Log.i("dressLog", "on forgot");
                signInView.loadForgotAccountActivity();
                break;
        }
    }

    void onDetachView()
    {
        signInView = null;
    }
}
