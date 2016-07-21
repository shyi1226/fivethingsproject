package com.example.android.fivethingsproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openTsimShaTsuiActivity(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openCentralActivity(View view){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void openYauMaTeiActivity(View view){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void openMacauActivity(View view){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void openLantauActivity(View view){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}