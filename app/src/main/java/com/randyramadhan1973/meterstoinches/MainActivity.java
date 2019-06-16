package com.randyramadhan1973.meterstoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
    1M =  39.3701 in
     */

    private EditText inputValue;
    private EditText enterInches;
    private Button ConvertToInchesButton, ConvertToMetersButton;
    private TextView resultTextView;
    private Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputValue = (EditText) findViewById(R.id.EnterValue);
        resultTextView = (TextView) findViewById(R.id.resultID);


        ConvertToInchesButton = (Button) findViewById(R.id.convertButtonInchesID);
        ConvertToInchesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //conversion Logic
                double multipler = 39.37;
                double result = 0.0;

                //condition if user not input anything
                if (inputValue.getText().toString().equals("")) {
                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    //if user input number an success
                    double meterValue = Double.parseDouble(inputValue.getText().toString()); // for make string become numbers
                    result = meterValue * multipler;

                    //show result
                    //for decimal 2 point : String.format("%.2f")
                    resultTextView.setText(String.format("%.2f", result) + " Inches");
                    resultTextView.setTextColor(Color.BLACK);
                }

                clearButton = (Button) findViewById(R.id.btnClear);
                clearButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        inputValue.setText("");
                        resultTextView.setText("");
                    }
                });
            }

        });
        ConvertToMetersButton = (Button) findViewById(R.id.convertButtonMetersID);
        ConvertToMetersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //conversion Logic
                double multipler = 39.37;
                double result = 0.0;

                //condition if user not input anything
                if (inputValue.getText().toString().equals("")) {
                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    //if user input number an success
                    double meterValue = Double.parseDouble(inputValue.getText().toString()); // for make string become numbers
                    result = meterValue / multipler;

                    //show result
                    //for decimal 2 point : String.format("%.2f")
                    resultTextView.setText(String.format("%.2f", result) + " Meters");
                    resultTextView.setTextColor(Color.BLACK);
                }

                clearButton = (Button) findViewById(R.id.btnClear);
                clearButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        inputValue.setText("");
                        resultTextView.setText("");
                    }
                });
            }

        });
    }
}



