package com.example.cerina.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorBlack));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorCoral));
            }
        });

        findViewById(R.id.button3).setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //grab text from edit view and put it in the text view
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();

                //check if text is empty
                if(TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello From Cerina!!");
                }
                else{
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }

            }
        }));

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset text color back to white
                ((TextView)findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorWhite));
                //reset background color to colorprimarydark
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                //change text back
                ((TextView) findViewById(R.id.textView)).setText("Hello From Cerina!!");
            }
        });


    }
}
