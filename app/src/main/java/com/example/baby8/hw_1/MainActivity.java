package com.example.baby8.hw_1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        et1 = findViewById(R.id.et1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textEntered = et1.getText().toString();

                Context context = MainActivity.this;
                Class destinationActivity = ChildActivity.class;

                Intent starChildActivityIntent = new Intent(context, destinationActivity);
                starChildActivityIntent.putExtra(Intent.EXTRA_TEXT, textEntered);
                startActivity(starChildActivityIntent);


            }
        });

    }
}
