package com.biba.boba.dresscode.presentation.signin_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.presentation.forgot_account_screen.ForgotAccountActivity;
import com.biba.boba.dresscode.presentation.main_screen.MainActivity;
import com.biba.boba.dresscode.presentation.signout_screen.SignOutActivity;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

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
        Button signInButton = findViewById(R.id.sign_in);
        TextView forgotAccButton = findViewById(R.id.forgot_account);
        TextView signOutButton = findViewById(R.id.sign_out);

        passwordTextView = findViewById(R.id.password_field);
        loginTextView = findViewById(R.id.login_field);
        errorMessageTextView = findViewById(R.id.error_message);


        signInButton.setOnClickListener(presenter);
        signOutButton.setOnClickListener(presenter);
        forgotAccButton.setOnClickListener(presenter);
    }



    @Override
    public void loadMainActivity()
    {
        String pass = passwordTextView.getText().toString();
        String login = loginTextView.getText().toString();

        boolean validData = presenter.checkValidData(login, pass);

        if (validData)
        {
            Log.i("dressLog", "переходим на галвную страницу");
            loadActivity(MainActivity.class);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
        else
            Log.i("dressLog", "остаемся на этой странице");
    }

    @Override
    public void loadForgotAccountActivity()
    {
        Log.i("dressLog", "activate method loadForgotAccountActivity");

        loadActivity(ForgotAccountActivity.class);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void loadCreateAccActivity()
    {
        Log.i("dressLog", "activate method loadCreateAccActivity");

        loadActivity(SignOutActivity.class);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void showMessage(String message)
    {
        errorMessageTextView.setText(message);
    }

    private void loadActivity(Class loadActivity)
    {
        Intent forgotAccountIntent = new Intent(this, loadActivity);
        startActivity(forgotAccountIntent);
    }

}
