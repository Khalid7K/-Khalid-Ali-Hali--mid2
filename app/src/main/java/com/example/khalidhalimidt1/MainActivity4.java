package com.example.khalidhalimidt1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        EditText data = (EditText)findViewById(R.id.editTextTextPersonName2);
        Button bttn4 = (Button)findViewById(R.id.button4);
        Button bttn6 = (Button)findViewById(R.id.button6);
        TextView txtv9 = (TextView)findViewById(R.id.textView9);
        TextView txt10 = (TextView)findViewById(R.id.textView10);

        bttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data.getText()== "a"){
                    deleteDatabase();
                }
            }
        });

        bttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data.isEmpty()) {
                    Toast.makeText(MainActivity4.this, "Please Insert Something", Toast.LENGTH_LONG).show();
                }
                else{

                }
            }
        });

    }
}