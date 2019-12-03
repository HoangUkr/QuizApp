package com.example.quizapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Grade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        Intent intent = getIntent();
        CardView cardview2 = (CardView)findViewById(R.id.cardView2);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenCategory(v);
            }
        });
        CardView cardview4 = (CardView)findViewById(R.id.cardView4);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenCategory(v);
            }
        });
        CardView cardview5 = (CardView)findViewById(R.id.cardView5);
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenCategory(v);
            }
        });
        CardView cardview6 = (CardView)findViewById(R.id.cardView6);
        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenCategory(v);
            }
        });

    }
    public void OpenCategory(View view)
    {
        Intent intent = new Intent(this, Category.class);
        startActivity(intent);
    }
}
