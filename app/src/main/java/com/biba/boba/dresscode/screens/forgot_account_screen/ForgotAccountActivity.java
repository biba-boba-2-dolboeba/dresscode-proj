package com.biba.boba.dresscode.screens.forgot_account_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.biba.boba.dresscode.R;


public class ForgotAccountActivity extends AppCompatActivity implements ForgotAccountView
{
    private ForgotAccountPresenter presenter;

    private TextView errorTextView;
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
        errorTextView = findViewById(R.id.forgot_account_error_message);

        Button nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(presenter);
    }


    @Override
    public void loadActivity()
    {
        String email = emailTextVie.getText().toString();

        boolean checkEmail = presenter.isValidData(email);

        if (checkEmail)
        {
            ///загружаем сдел активити
        }
    }

    @Override
    public void showErrorMessage(String error_message)
    {
         errorTextView.setText(error_message);
    }

}
