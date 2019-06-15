package com.randyramadhan1973.meterstoinches;

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

    private EditText enterMeter;
    private Button ConvertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeter = (EditText) findViewById(R.id.metersEditText);
        resultTextView = (TextView) findViewById(R.id.resultID);

        ConvertButton = (Button) findViewById(R.id.convertButtonID);
        ConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //conversion Logic
                double multipler = 39.37;
                double result = 0.0;

                double meterValue = Double.parseDouble(enterMeter.getText().toString()); // for make string become numbers
                result = meterValue * multipler;

                //show result
                resultTextView.setText(Double.toString(result)+ " Inch");
            }
        });
    }
}
