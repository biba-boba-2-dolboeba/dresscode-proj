package com.biba.boba.dresscode.presentation.forgot_account_screen;

import android.view.View;

import com.biba.boba.dresscode.R;

public class ForgotAccountPresenter implements View.OnClickListener
{
    private ForgotAccountView view;

    ForgotAccountPresenter(ForgotAccountView view)
    {
        this.view = view;
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
