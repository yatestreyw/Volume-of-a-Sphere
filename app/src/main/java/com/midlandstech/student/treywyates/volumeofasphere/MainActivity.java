package com.midlandstech.student.treywyates.volumeofasphere;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        EditText etRadius = findViewById(R.id.etRadius);
        TextView tvAnswer = findViewById(R.id.tvAnswer);
        double radius;
        Sphere theSphere;

        /*
         * Try block used so that an empty string does not
         * crash the app
         */
        try {
            //Parses the radius the user gave
            radius = Double.parseDouble(etRadius.getText().toString());

            //Creates a new sphere with the given radius
            theSphere = new Sphere(radius);

            //Calls toString() to output volume
            tvAnswer.setText(theSphere.toString());
        } catch(NumberFormatException nfe) {

        }
    }
}
