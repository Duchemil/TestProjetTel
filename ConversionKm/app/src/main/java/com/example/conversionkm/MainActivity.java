package com.example.conversionkm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    // Declaration des widgets
    EditText edittext;
    TextView textView, textView2;
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialisation

        textView = findViewById(R.id.resultatMiles);
        edittext = findViewById(R.id.editTextNumber);
        button = (Button) findViewById(R.id.button);
        Switch sw = (Switch) findViewById(R.id.switch1);

        // Click event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        if (sw.isChecked()) {
                            ConvertMilesToKm();
                        } else {
                            ConvertMetersToMiles();
                        }
                    }
        });
    }

        private void ConvertMetersToMiles () {
            String valueEnteredInMeter = edittext.getText().toString();
            Double Meters = Double.parseDouble(valueEnteredInMeter);
            Double Miles = Meters / 1.609;
            textView.setText("" + Miles + " Miles");
        }

        private void ConvertMilesToKm () {
            String valueEnteredInMeter = edittext.getText().toString();
            Double Meters = Double.parseDouble(valueEnteredInMeter);
            Double Miles = Meters * 1.609;
            textView.setText("" + Miles + " Kilomètres");
        }
    }
