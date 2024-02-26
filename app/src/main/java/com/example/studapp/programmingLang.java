package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class programmingLang extends AppCompatActivity {
    boolean status = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming_lang);
    }

    public void cprog(View view) {
        FragmentManager m = getSupportFragmentManager();
        FragmentTransaction t = m.beginTransaction();
        if (!status) {
            cpro cp = new cpro();
            t.replace(R.id.frame, cp);
            t.commit();
            //status = true;

        }
    }

    public void cpp(View view) {
        FragmentManager m = getSupportFragmentManager();
        FragmentTransaction t = m.beginTransaction();
        if (!status) {
            cppfrag cpp = new cppfrag();
            t.replace(R.id.frame, cpp);
            t.commit();
            //status = true;

        }
    }

    public void javatu(View view) {
        FragmentManager m = getSupportFragmentManager();
        FragmentTransaction t = m.beginTransaction();
        if (!status) {
            javaprofrag java = new javaprofrag();
            t.replace(R.id.frame, java);
            t.commit();
            //status = true;

        }
    }

    public void pythpro(View view) {
        FragmentManager m = getSupportFragmentManager();
        FragmentTransaction t = m.beginTransaction();
        if (!status) {
            pytprofrag pyth = new pytprofrag();
            t.replace(R.id.frame, pyth);
            t.commit();
            //status = true;

        }
    }
}