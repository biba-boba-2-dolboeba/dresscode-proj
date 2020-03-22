package com.biba.boba.dresscode.screens.signout_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.screens.main_screen.MainActivity;

public class SignOutActivity extends AppCompatActivity implements SignOutView
{
    private SignOutPresenter presenter;

    private TextView nameTextView;
    private TextView e_mailTextView;
    private TextView passTextView;
    private TextView repPassTextView;
    private TextView errorMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sing_out_layout);

        presenter = new SignOutPresenter(this);

        initAllView();
    }


    private void initAllView()
    {
        nameTextView = findViewById(R.id.name_field);
        e_mailTextView = findViewById(R.id.e_mail_field);
        passTextView = findViewById(R.id.reg_pass_field);
        repPassTextView = findViewById(R.id.reg_repeat_pass_field);
        errorMessageTextView = findViewById(R.id.reg_error_message);

        Button createAccountButton = findViewById(R.id.create_acc);
        createAccountButton.setOnClickListener(presenter);
    }


    @Override
    public void loadMainActivity()
    {
        String name  = nameTextView.getText().toString();
        String e_mail = e_mailTextView.getText().toString();
        String pass = passTextView.getText().toString();
        String repeat_pass = repPassTextView.getText().toString();

        boolean valid = presenter.isValidDates(name, e_mail, pass, repeat_pass);

        if(valid)
        {
            loadActivity(MainActivity.class);
            overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
        }
    }

    private void loadActivity(Class loadActivity)
    {
        Intent intent = new Intent(this, loadActivity);
        startActivity(intent);
    }

    @Override
    public void showErrorMessage(String message)
    {
        errorMessageTextView.setText(message);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        presenter.onDetachView();
    }

    @Override
    public void finish()
    {
        super.finish();
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }
}
