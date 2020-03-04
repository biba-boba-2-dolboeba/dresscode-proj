package com.biba.boba.dresscode.presentation.signin_screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.presentation.forgot_account_screen.ForgotAccountActivity;

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

        Intent forgotAccountIntent = new Intent(this, ForgotAccountActivity.class);
        startActivity(forgotAccountIntent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void showMessage(String message)
    {
        errorMessageTextView.setText(message);
    }


}
