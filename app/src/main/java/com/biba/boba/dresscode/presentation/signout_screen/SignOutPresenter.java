package com.biba.boba.dresscode.presentation.signout_screen;

import android.view.View;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.dataСhecking.RegistrationDataChecking;

public class SignOutPresenter implements View.OnClickListener {

    private SignOutView signOutView;
    private RegistrationDataChecking registrationDataChecking;

    SignOutPresenter(SignOutView signOutView)
    {
        this.signOutView = signOutView;
        registrationDataChecking = new RegistrationDataChecking();
    }

    boolean isValidDates(String name, String email, String pass, String repeat_pass)
    {
        if(!registrationDataChecking.checkName(name))
        {
            signOutView.showErrorMessage("incorrect name");
            return false;
        }

        if(!registrationDataChecking.checkEmail(email))
        {
            signOutView.showErrorMessage("incorrect e-mail");
            return false;
        }

        if (!registrationDataChecking.checkPassword(pass))
        {
            signOutView.showErrorMessage("incorrect password");
            return false;
        }

        if (!registrationDataChecking.checkMatchPassword(pass, repeat_pass))
        {
            signOutView.showErrorMessage("passwords don 't match");
            return false;
        }

        signOutView.showErrorMessage("");
        return true;
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.create_acc)
        {
            signOutView.loadMainActivity();
        }
    }

    void onDetachView()
    {
        signOutView = null;
    }
}
