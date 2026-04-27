package com.example.learnadday2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText heightText = findViewById(R.id.heightInput);
                String heightStr = heightText.getText().toString();

                final EditText weightText = findViewById(R.id.weightInput);
                String weightStr = weightText.getText().toString();

                if (heightStr.isEmpty() || weightStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both height and weight", Toast.LENGTH_SHORT).show();
                    return;
                }

                double height = Double.parseDouble(heightStr);
                double weight = Double.parseDouble(weightStr);

                if (height <= 0) {
                    Toast.makeText(MainActivity.this, "Height must be greater than 0", Toast.LENGTH_SHORT).show();
                    return;
                }

                double BMI = BMICalculator.calculateBMI(weight, height);
                final EditText BMIResult = findViewById(R.id.BMIResult);
                BMIResult.setText(String.format(Locale.US, "%.2f", BMI));

                String BMI_Cat = BMICalculator.getCategory(BMI);
                final TextView BMICategory = findViewById(R.id.BMICategory);
                BMICategory.setText(BMI_Cat);
            }
        });
    }
}