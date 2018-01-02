package com.example.persephone.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView tv = (TextView) findViewById(R.id.tview);
       Button btn = (Button) findViewById(R.id.button);

       tv.setOnClickListener(tvOnClickListener);


       tv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "tv cicked", Toast.LENGTH_SHORT).show();
           }
       });

    }

    View.OnClickListener tvOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };


}
