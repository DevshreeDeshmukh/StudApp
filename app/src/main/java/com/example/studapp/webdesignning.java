package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class webdesignning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webdesignning);
    }

    public void htmldes(View view) {
        FragmentManager m = getSupportFragmentManager();
        FragmentTransaction t = m.beginTransaction();
            htmlprog htm = new htmlprog();
            t.replace(R.id.frame, htm);
            t.commit();
            //status = true;


    }

    public void cssdesign(View view) {
        FragmentManager m = getSupportFragmentManager();
        FragmentTransaction t = m.beginTransaction();
        cssprog css = new cssprog();
        t.replace(R.id.frame, css);
        t.commit();

    }

    public void javascript(View view) {
        FragmentManager m = getSupportFragmentManager();
        FragmentTransaction t = m.beginTransaction();
        jsprog js = new jsprog();
        t.replace(R.id.frame, js);
        t.commit();

    }

    public void phpweb(View view) {
        FragmentManager m = getSupportFragmentManager();
        FragmentTransaction t = m.beginTransaction();
        phpprog php = new phpprog();
        t.replace(R.id.frame, php);
        t.commit();

    }
}