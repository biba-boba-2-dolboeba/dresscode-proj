package com.biba.boba.dresscode.presentation.signinscreen;

import android.util.Log;
import android.view.View;

import com.biba.boba.dresscode.R;

public class SignInPresenter implements View.OnClickListener
{
    private final SignInView signInView;


    public SignInPresenter(SignInView signInView)
    {
        this.signInView = signInView;
    }




    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.sign_in_button :
                Log.d("dressLog", "triggered sign_in");
                break;

            case R.id.forgot_account:
                Log.d("dressLog", "triggered forgot_account");
                break;

        }


    }
}
