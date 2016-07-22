package com.example.android.fivethingsproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ee5415 on 7/21/2016.
 */
public class MainActivity6 extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void hourInformation(View view){
        String message =
                "             Sunday\t       10AM–9PM\n" +
                "             Monday\t       10:30AM–9PM\n" +
                "             Tuesday\t     10:30AM–9PM\n" +
                "             Wednesday  10:30AM–9PM\n" +
                "             Thursday     \t10:30AM–9PM\n" +
                "             Friday            10AM–9PM\n" +
                "             Saturday       10AM–9PM";
        TextView hour_text_view = (TextView) findViewById(R.id.hourDisney);
        hour_text_view.setText(message);
    }

    public void priceInformation(View view){
        String message =  "Ticket Types\tStandard Day / Designated Day\n" +
                "General Ticket (aged 12-64)\tHK$ 539\n" +
                "Child Ticket (aged 3-11)\tHK$ 385\n" +
                "Senior Ticket (aged 65 or above)\tHK$ 100";
        TextView price_text_view = (TextView) findViewById(R.id.priceDisney);
        price_text_view.setText(message);
    }
}