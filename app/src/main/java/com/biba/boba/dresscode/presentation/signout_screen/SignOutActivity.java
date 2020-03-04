package com.biba.boba.dresscode.presentation.signout_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.biba.boba.dresscode.R;

public class SignOutActivity extends AppCompatActivity implements SignOutView
{

    private SignOutPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sing_out_layout);


        presenter = new SignOutPresenter(this);
    }


    private void initAllViews()
    {

    }






    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }


}
