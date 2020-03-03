package com.biba.boba.dresscode.presentation.signinscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.biba.boba.dresscode.R;

public class SignInActivity extends AppCompatActivity implements SignInView
{
    private SignInPresenter presenter;

    Button signInButton;
    TextView forgotAccTextView;
    TextView passwordTextView;
    TextView loginTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_layout);

        presenter = new SignInPresenter(this);

        initAllView();
    }

    private void initAllView()
    {
        signInButton = findViewById(R.id.sign_in_button);
        forgotAccTextView = findViewById(R.id.forgot_account);
        passwordTextView = findViewById(R.id.password_field);
        loginTextView = findViewById(R.id.login_field);

        signInButton.setOnClickListener(presenter);
        forgotAccTextView.setOnClickListener(presenter);
    }


    @Override
    public void loadActivity()
    {

    }

    @Override
    public void showError()
    {

    }
}
