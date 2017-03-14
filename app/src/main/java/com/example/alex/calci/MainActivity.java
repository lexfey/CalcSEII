package com.example.alex.calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView resultView;          //initialize text fields
        final EditText dividendField;
        final EditText divisorField;

        resultView = (TextView) findViewById(R.id.resultView);
        dividendField = (EditText) findViewById(R.id.dividendField);
        divisorField = (EditText) findViewById(R.id.divisorField);

        //Create divideButton and implement Action listener for division and output
        Button divideButton = (Button) findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View v) {

                try{            //try division of input and output of result in result field

                float dividend = Float.parseFloat(dividendField.getText().toString());
                float divisor = Float.parseFloat(divisorField.getText().toString());
                float result = dividend/divisor;
                resultView.setText(Float.toString(result));
            }catch(Exception e){                                 //exception output in case of invalid input
                    resultView.setText("Please enter valid numbers!");
                    resultView.setTextColor(0xFFFF4444);          //change of output text color to "red"
                }

            }
        });

        //Implementation of reset button to clear all fields

        Button ResetButton = (Button) findViewById(R.id.ResetButton);
        ResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View v) {

                dividendField.setText("");
                divisorField.setText("");
                resultView.setText("");


            }
        });

    }



    }

