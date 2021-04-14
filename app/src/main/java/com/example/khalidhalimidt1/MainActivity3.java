package com.example.khalidhalimidt1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        SearchView searchv = (SearchView)findViewById(R.id.searchView);
        Button bttn3 = (Button)findViewById(R.id.button2);
        Button bttn4 = (Button)findViewById(R.id.button3);
        TextView txtv = (TextView)findViewById(R.id.textView6);

        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (searchv.isEmpty) {
                    Toast.makeText(MainActivity3.this, "Please Insert Something", Toast.LENGTH_LONG).show();
                }
                else {

                }
            }

        });
        bttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(t);
            }
        });
    }
}