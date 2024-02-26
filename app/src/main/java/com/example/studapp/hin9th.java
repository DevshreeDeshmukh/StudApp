package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class hin9th extends AppCompatActivity {
    Intent i=null;
    Intent ch=null;
    TabHost host;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hin9th);
        host = findViewById(R.id.host);
        host.setup();
        TabHost.TabSpec s=host.newTabSpec("Syllabus");
        s.setContent(R.id.tab1);
        s.setIndicator("Syllabus");
        host.addTab(s);

        s=host.newTabSpec("Videos");
        s.setContent(R.id.tab2);
        s.setIndicator("Videos");
        host.addTab(s);

        s=host.newTabSpec("Book");
        s.setContent(R.id.tab3);
        s.setIndicator("Book");
        host.addTab(s);
    }

    public void vid1(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLVLoWQFkZbhXXAOBv5pdiTibLiz3bw6Dn"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void vid2(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLVLoWQFkZbhVLceqKPhJYBfhsArkxiRO8"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void vid4(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLVLoWQFkZbhXx9Br-9Bg5x3Hk87stwMCv"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void vid3(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLVLoWQFkZbhWeazeqmnANo_3hD-TAqKG3"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void Book(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-books-class-9-hindi/"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void Book1(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-books-class-9-hindi/"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void Book2(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-books-class-9-hindi/"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }
}