package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class hin10 extends AppCompatActivity {
    Intent i;
    Intent ch;
    TabHost host;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hin10);
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
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLVLoWQFkZbhXrQ9yWGIsddggoR8utp4eC"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);

    }
    public void vid2(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLVLoWQFkZbhUYLCZUIrHtbajXH6DLMrMa"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);

    }

    public void vid3(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLVLoWQFkZbhX6yDIVCVeux9e1v_Ohv2LH"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);
    }

    public void vid4(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLVLoWQFkZbhUW5j09qOmJeDTamltkf5Cw"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);
    }
    public void Book(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-book-class-10-hindi/"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void Book1(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-books-class-10-hindi/"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void Book2(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-books-class-10-hindi/"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }


}