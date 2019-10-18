package com.example.peop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProjectSpec extends AppCompatActivity {

    ImageView spec1,spec2,spec3,spec4,spec5,spec6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_spec);

        spec1 = (ImageView)findViewById(R.id.spec1);
        spec2 = (ImageView)findViewById(R.id.spec2);
        spec3 = (ImageView)findViewById(R.id.spec3);
        spec4 = (ImageView)findViewById(R.id.spec4);
        spec5 = (ImageView)findViewById(R.id.spec5);
        spec6 = (ImageView)findViewById(R.id.spec6);

        spec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProjectSpec.this, HomeActivity.class));
            }
        });

        spec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        spec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        spec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        spec5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        spec6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
