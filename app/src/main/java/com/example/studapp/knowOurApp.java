package com.example.studapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;

public class knowOurApp extends AppCompatActivity {
    ImageButton next,prev;
    TextView tv;
    private ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_our_app);
        tv=findViewById(R.id.marq);
        tv.setSelected(true);
        viewFlipper=findViewById(R.id.viewf);
        next=findViewById(R.id.next);
        prev=findViewById(R.id.prev);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
                }


        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            viewFlipper.showPrevious();
            }

        });



    }

    public void class9cbse(View view) {
        Intent i=new Intent(knowOurApp.this,nineth.class);
        startActivity(i);
    }

    public void class10cbse(View view) {
        Intent i=new Intent(knowOurApp.this,tenth.class);
        startActivity(i);
    }

    public void prolang(View view) {
        Intent i=new Intent(knowOurApp.this,programmingLang.class);
        startActivity(i);

    }

    public void webprog(View view) {
        Intent i=new Intent(knowOurApp.this,webdesignning.class);
        startActivity(i);
    }
}
//"During This Hard Time We Here Thought to give Some Sort Of Help To Students, Those due to some problem are not able to Buy Books and are studying Online"