package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etWeight, etHeight;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWeight = findViewById(R.id.etWeight);
        etHeight = findViewById(R.id.etHeight);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String weightStr = etWeight.getText().toString();
                String heightStr = etHeight.getText().toString();

                if (weightStr.isEmpty() || heightStr.isEmpty()) {
                    tvResult.setText("Please enter both weight and height");
                    return;
                }

                double weight = Double.parseDouble(weightStr);
                double height = Double.parseDouble(heightStr);

                   if (height <= 0 || weight <= 0) {
            tvResult.setText("Weight must be in kg and height in meters and greater than 0");
            return;
        }

                double bmi = weight / (height * height);

                String category;

                if (bmi < 18.5) {
                    category = "Underweight";
                } else if (bmi < 25) {
                    category = "Normal";
                } else if (bmi < 30) {
                    category = "Overweight";
                } else {
                    category = "Obese";
                }

                tvResult.setText(
                        String.format("BMI: %.2f\nCategory: %s", bmi, category)
                );
            }
        });
    }
}
