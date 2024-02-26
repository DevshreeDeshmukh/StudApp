        package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Thread th;
   ImageView iv2;
   Animation a;
    TextView tv;
       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv2=findViewById(R.id.iv2);
           a= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
           iv2.startAnimation(a);


           th=new Thread()
        {
                public void run ()
                {

                    try {
                        sleep(2500);
                        Intent i = new Intent(MainActivity.this, login.class);
                        startActivity(i);
                        finish();
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }

                }
                ;

        };
        th.start();
    }


}