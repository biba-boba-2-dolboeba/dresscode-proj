package com.biba.boba.dresscode.presentation.signout_screen;

import android.view.View;

import androidx.annotation.NonNull;

import com.biba.boba.dresscode.R;

public class SignOutPresenter implements View.OnClickListener {

    private SignOutView signOutView;

    SignOutPresenter(SignOutView signOutView) {
        this.signOutView = signOutView;
    }

    boolean isValidDates(String name, String email, String pass, String repeat_pass)
    {
        if(name.equals("") || email.equals("") || pass.equals("") || repeat_pass.equals(""))
        {
            signOutView.showErrorMessage("invalid data");
            return false;
        }

        if(name.contains(" "))
        {
            signOutView.showErrorMessage("the name must not contain spaces");
            return false;
        }

        if (!email.contains("@") || email.contains(" "))
        {
            signOutView.showErrorMessage("incorrect e-mail");
            return false;
        }

        if (!pass.equals(repeat_pass))
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
