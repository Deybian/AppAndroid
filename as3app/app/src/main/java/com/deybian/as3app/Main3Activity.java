package com.deybian.as3app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    //ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
      //  imageView=(ImageView) findViewById(R.id.imageView);

    }

    public void siguiente3(View view){
        Intent cambio = new Intent(this, Main4Activity.class);
        startActivity(cambio);
    }
    }