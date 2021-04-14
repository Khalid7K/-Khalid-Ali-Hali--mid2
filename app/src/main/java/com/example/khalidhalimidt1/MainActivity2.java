package com.example.khalidhalimidt1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText txtid = (EditText)findViewById(R.id.editTextNumberSigned);
        EditText txtname = (EditText)findViewById((R.id.editTextTextPersonName));
        EditText txtE = (EditText)findViewById((R.id.editTextTextEmailAddress));
        EditText txtnumber = (EditText)findViewById((R.id.editTextTextPersonName2));
        Button bttn1 = (Button)findViewById(R.id.button);
        Button bttn2 = (Button)findViewById(R.id.button5);
        TextView txtv1 = (TextView)findViewById(R.id.textView7);

bttn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if( txtE.getText().toString().length() == 0 && txtnumber.getText().toString().length()==0 )
            txtE.setError( "Please Enter your Email!" );
            txtnumber.setError("Please Enter your Number!");

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
});
bttn2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
     Intent nxtpage = new Intent(MainActivity.this, MainActivity2.class);
     startActivity(nxtpage);
    }
});

    }
}