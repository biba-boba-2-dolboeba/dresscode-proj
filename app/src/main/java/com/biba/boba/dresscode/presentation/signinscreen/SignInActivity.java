package com.biba.boba.dresscode.presentation.signinscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.biba.boba.dresscode.R;

public class SignInActivity extends AppCompatActivity implements SignInView
{
    private SignInPresenter presenter;

    private TextView passwordTextView;
    private TextView loginTextView;
    private TextView errorMessageTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_layout);

        presenter = new SignInPresenter(this);

        initAllView();
    }

    private void initAllView()
    {
        Button signInButton = findViewById(R.id.sign_in_button);
        TextView forgotAccTextView = findViewById(R.id.forgot_account);
        passwordTextView = findViewById(R.id.password_field);
        loginTextView = findViewById(R.id.login_field);
        errorMessageTextView = findViewById(R.id.error_message);


        signInButton.setOnClickListener(presenter);
        forgotAccTextView.setOnClickListener(presenter);
    }


    @Override
    public void loadMainActivity()
    {
        String pass = passwordTextView.getText().toString();
        String login = loginTextView.getText().toString();

        boolean validData = presenter.checkValidData(login, pass);

        if (validData)
            Log.i("dressLog", "переходим на галвную страницу");
        else
            Log.i("dressLog", "остаемся на этой странице");
    }

    @Override
    public void loadForgotAccountActivity()
    {
        Log.i("dressLog", "activate method loadForgotAccountActivity");
    }

    @Override
    public void showMessage(String message)
    {
        errorMessageTextView.setText(message);
    }


}
