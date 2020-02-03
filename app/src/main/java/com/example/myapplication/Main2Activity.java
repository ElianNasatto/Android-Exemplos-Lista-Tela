package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent myIntent = getIntent(); // gets the previously created intent
        String firstKeyName = myIntent.getStringExtra("item");
        Toast toast = Toast.makeText(getApplicationContext(),firstKeyName,Toast.LENGTH_SHORT);
        toast.show();
        TextView text = findViewById(R.id.textView);
        text.setText(firstKeyName);

    }
}
