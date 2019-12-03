package com.example.quizapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        CardView cardView = (CardView)findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                OpenGrade(v);
            }
        });
        TextView registration = (TextView)findViewById(R.id.registration);
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenRegistration(v);
            }
        });
    }
    public void OpenGrade(View view)
    {
        Intent intent = new Intent(this, Grade.class);
        startActivity(intent);
    }
    public void OpenRegistration(View view){
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }
}
