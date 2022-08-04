package com.example.fofo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView calaulator = findViewById(R.id.name);
        TextView total = findViewById(R.id.totall);
        EditText num1 = findViewById(R.id.aya);
        EditText num2 = findViewById(R.id.ayah);
        Button calaulatorr = findViewById(R.id.button);
    }
}