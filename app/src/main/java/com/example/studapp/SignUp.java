package com.example.studapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    DBHelper dbh;
    Button siup;
    EditText name,eadd1,epass2,eph,edate,epass3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        dbh=new DBHelper(this);
        siup=(Button)findViewById(R.id.siup);
        name=(EditText)findViewById(R.id.name);
        eadd1=(EditText)findViewById(R.id.eadd1);
        epass2=(EditText)findViewById(R.id.epass2);
        eph=(EditText)findViewById(R.id.eph);
        edate=(EditText)findViewById(R.id.edate);
        epass3=(EditText)findViewById(R.id.epass3);
        String ep, ep1;
        ep=epass2.getText().toString();
        ep1=epass3.getText().toString();

        siup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.length()==0)
                {
                    name.setError("Please Enter Your Name...");
                }else if(!ep1.equals(ep))
                {
                    epass3.setError("Please Enter Same Password as above");
                }else if(eadd1.length()<8)
                {
                    eadd1.setError("Email Address Should contain more than equals to 8 characters...");
                }else if(eadd1.length()==0)
                {
                    eadd1.setError("Please Enter Your Name...");
                }else if(epass2.length()<8)
                {
                    epass2.setError("Password Should contain more than equals to 8 characters...");
                }else  if(epass2.length()==0)
                {
                    epass2.setError("Please Enter Password...");
                }else if(eph.length()==0)
                {
                    eph.setError("Please Enter Phone number...");
                }else if(eph.length()<10)
                {
                    eph.setError("Phone number Should contain 10 digits");
                }else if(eph.length()>10)
                {
                    eph.setError("Phone number Should contain 10 digits");
                }else  if(edate.length()==0)
                {
                    edate.setError("Please Enter Your Name...");
                }else
                {
                    clickMe();

                    }
                   }
                   });

                }

    private void clickMe() {
        String unm=eadd1.getText().toString();
        String pass=epass3.getText().toString();
        Boolean result = dbh.insertData(unm, pass);
        if(result==true)
        {
            Toast.makeText(this, "Data Is Saved", Toast.LENGTH_SHORT).show();
            Toast.makeText(SignUp.this, "Signing Up", Toast.LENGTH_SHORT).show();

            final AlertDialog.Builder ad;
            ad = new AlertDialog.Builder(SignUp.this);
            ad.setTitle("SUBMIT");
            ad.setMessage("Are you sure you want to submit your details for registration?");
            ad.setCancelable(false);
            ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent i=new Intent(SignUp.this,knowOurApp.class);
                    startActivity(i);
                }
            });
            ad.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            ad.create().show();

        }
        else
        {
            epass2.setError("User Already Exists");
            eadd1.setError("User Already Exists");
            Toast.makeText(this, "User Already Exists Please Login", Toast.LENGTH_SHORT).show();
            Intent i= new Intent(SignUp.this,login.class);
            startActivity(i);
        }
    }

}