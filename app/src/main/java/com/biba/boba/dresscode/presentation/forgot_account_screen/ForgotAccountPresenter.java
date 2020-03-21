package com.biba.boba.dresscode.presentation.forgot_account_screen;

import android.view.View;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.dataСhecking.DataChecking;

public class ForgotAccountPresenter implements View.OnClickListener
{
    private ForgotAccountView view;
    private DataChecking dataChecking = new DataChecking();

    ForgotAccountPresenter(ForgotAccountView view)
    {
        this.view = view;
    }

    boolean isValidData(String email)
    {
        if (!dataChecking.checkEmail(email))
        {
            view.showErrorMessage("incorrect e-mail");
            return false;
        }

        view.showErrorMessage("");
        return true;
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.next_button)
        {
            view.loadActivity();
        }
    }


    void onDetachView()
    {
        view = null;
    }
}
