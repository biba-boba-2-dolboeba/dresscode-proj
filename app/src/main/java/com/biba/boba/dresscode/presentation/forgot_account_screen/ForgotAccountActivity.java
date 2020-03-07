package com.biba.boba.dresscode.presentation.forgot_account_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.biba.boba.dresscode.R;

public class ForgotAccountActivity extends AppCompatActivity implements ForgotAccountView
{
    private ForgotAccountPresenter presenter;

    private TextView emailTextVie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_account_layout);

        presenter = new ForgotAccountPresenter(this);

        initAllView();
    }

    private void initAllView()
    {
        emailTextVie = findViewById(R.id.e_mail_to_restore_acc);

        Button nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(presenter);
    }


    @Override
    public void loadActivity()
    {

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
