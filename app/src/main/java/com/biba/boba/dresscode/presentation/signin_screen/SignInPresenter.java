package com.biba.boba.dresscode.presentation.signin_screen;

import android.util.Log;
import android.view.View;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.dataСhecking.RegistrationDataChecking;

public class SignInPresenter implements View.OnClickListener
{
    private SignInView view;

    SignInPresenter(SignInView view)
    {
        this.view = view;
    }

    boolean isValidData(String name, String pass)
    {
        view.showErrorMessage("");
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
                view.loadMainActivity();
                break;

            case R.id.sign_out_button:
                Log.i("dressLog", "on sign out");
                view.loadCreateAccActivity();
                break;

            case R.id.forgot_account_button:
                Log.i("dressLog", "on forgot");
                view.loadForgotAccountActivity();
                break;
        }
    }

    void onDetachView()
    {
        view = null;
    }
}
