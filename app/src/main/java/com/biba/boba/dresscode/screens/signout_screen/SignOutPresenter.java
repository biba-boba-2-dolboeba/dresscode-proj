package com.biba.boba.dresscode.screens.signout_screen;

import android.view.View;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.dataСhecking.DataChecking;

public class SignOutPresenter implements View.OnClickListener {

    private SignOutView signOutView;
    private DataChecking dataChecking;

    SignOutPresenter(SignOutView signOutView)
    {
        this.signOutView = signOutView;
        dataChecking = new DataChecking();
    }

    boolean isValidDates(String name, String email, String pass, String repeat_pass)
    {
        if(!dataChecking.checkName(name))
        {
            signOutView.showErrorMessage("incorrect name");
            return false;
        }

        if(!dataChecking.checkEmail(email))
        {
            signOutView.showErrorMessage("incorrect e-mail");
            return false;
        }

        if (!dataChecking.checkPassword(pass))
        {
            signOutView.showErrorMessage("incorrect password");
            return false;
        }

        if (!dataChecking.checkMatchPassword(pass, repeat_pass))
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
