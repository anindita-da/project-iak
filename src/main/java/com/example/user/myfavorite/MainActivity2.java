package com.example.user.myfavorite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button2 =(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(),MainActivity3.class);

                startActivity(i);



            }

        });


    }
}