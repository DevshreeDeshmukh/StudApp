package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class login extends AppCompatActivity {
    Button sup;
    Button log;
    EditText eadd,epass;
    TextView tv;
    DBHelper dbh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        method1();
        tv=findViewById(R.id.textView4);
        dbh=new DBHelper(this);

        Snackbar s=Snackbar.make(findViewById(android.R.id.content),"*If You're New User. Please Sign-Up By Clicking Sign Up Buttom.",Snackbar.LENGTH_INDEFINITE);
        s.getView().setBackgroundColor(getResources().getColor(R.color.mint));
        s.setTextColor(getResources().getColor(R.color.soldier_blue));
        s.show();
        eadd=(EditText)findViewById(R.id.eadd);
        epass=(EditText)findViewById(R.id.epass);
        log = (Button) findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(eadd.length()==0||epass.length()==0)
                {
                    eadd.setError("Please Enter in Fields");
                    epass.setError("Please Enter in Fields");
                }else{
                    String unm=eadd.getText().toString();
                    String pass=epass.getText().toString();
                    Boolean result = dbh.isValueExist(unm, pass);
                    if(result==true) {

                        Toast.makeText(login.this, "You Successfully Login", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(login.this, knowOurApp.class);
                        startActivity(i);
                    }
                    else
                    {
                        eadd.setError("Username dont match to database");
                        epass.setError("Password dont match to database");
                        Toast.makeText(login.this, "User Does not exists please Sign up", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

    }

    public void method1()
    {
        sup=(Button)findViewById(R.id.sup);
        sup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                openSignUp();
            }

        });
    }
    public void openSignUp()
    {
        Intent intent=new Intent(this,SignUp.class);
        startActivity(intent);
    }


        public void skip(View view) {
            Intent i = new Intent(login.this, knowOurApp.class);
            startActivity(i);
        }

}
