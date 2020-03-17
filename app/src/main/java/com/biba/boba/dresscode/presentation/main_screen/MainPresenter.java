package com.biba.boba.dresscode.presentation.main_screen;

import android.view.View;

import com.biba.boba.dresscode.R;

public class MainPresenter implements View.OnClickListener
{
    private MainView view;

    MainPresenter(MainView view)
    {
        this.view = view;
    }

    @Override
    public void onClick(View v)
    {
    }

    void onDetachView()
    {
        view = null;
    }
}
