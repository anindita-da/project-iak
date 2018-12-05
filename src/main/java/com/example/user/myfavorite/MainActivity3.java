package com.example.user.myfavorite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView dbvc;
    private TextView spvc;
    private TextView kiktvc;
    private TextView mungkinvc;
    private TextView jdsvc;
    private TextView alien;
    private TextView melayang;
    private TextView selamanya;
    private TextView cinta;
    private TextView iify;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        dbvc = (TextView) findViewById(R.id.song1);
        spvc = (TextView) findViewById(R.id.song2);
        kiktvc = (TextView) findViewById(R.id.song3);
        mungkinvc = (TextView) findViewById(R.id.song4);
        jdsvc = (TextView) findViewById(R.id.song5);
        alien = (TextView) findViewById(R.id.song6);
        melayang = (TextView) findViewById(R.id.song7);
        selamanya = (TextView) findViewById(R.id.song8);
        cinta = (TextView) findViewById(R.id.song9);
        iify = (TextView) findViewById(R.id.song10);


        dbvc.setAutoLinkMask(Linkify.WEB_URLS);
        dbvc.setText(R.string.dbvc);
        spvc.setAutoLinkMask(Linkify.WEB_URLS);
        spvc.setText(R.string.spvc);
        kiktvc.setAutoLinkMask(Linkify.WEB_URLS);
        kiktvc.setText(R.string.kiktvc);
        mungkinvc.setAutoLinkMask(Linkify.WEB_URLS);
        mungkinvc.setText(R.string.mungkinvc);
        jdsvc.setAutoLinkMask(Linkify.WEB_URLS);
        jdsvc.setText(R.string.jdsvc);
        alien.setAutoLinkMask(Linkify.WEB_URLS);
        alien.setText(R.string.alien);
        melayang.setAutoLinkMask(Linkify.WEB_URLS);
        melayang.setText(R.string.melayang);
        selamanya.setAutoLinkMask(Linkify.WEB_URLS);
        selamanya.setText(R.string.selamanya);
        cinta.setAutoLinkMask(Linkify.WEB_URLS);
        cinta.setText(R.string.cinta);
        iify.setAutoLinkMask(Linkify.WEB_URLS);
        iify.setText(R.string.iify);
    }
}
