package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView zero = findViewById(R.id.image);
        final ImageView one = findViewById(R.id.image1);
        final ImageView two = findViewById(R.id.image2);
        final ImageView three = findViewById(R.id.image3);
        final ImageView four = findViewById(R.id.image4);
        final ImageView five = findViewById(R.id.image5);
        final ImageView six = findViewById(R.id.image6);
        final ImageView seven = findViewById(R.id.image7);
        final ImageView eight = findViewById(R.id.image8);

        final TextView t = findViewById(R.id.textView);
        final Button reset = findViewById(R.id.reset);



    }

}