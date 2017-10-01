package com.veara.robottests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
     String text =    ((EditText) findViewById(R.id.editText)).getText().toString()+ " " +
                ((EditText) findViewById(R.id.editText2)).getText().toString();
        ((TextView) findViewById(R.id.textView)).setText(text);
    }
}
