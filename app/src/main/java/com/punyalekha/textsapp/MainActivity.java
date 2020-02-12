package com.punyalekha.textsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    Button messageButton;
    EditText responseText;
    TextView displayText;
    TextView displayMessages;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        final String[] colors = res.getStringArray(R.array.rainbow_array);
        submitButton = findViewById(R.id.clickButton);
        messageButton = findViewById(R.id.clickButton2);
        responseText = findViewById(R.id.responseEditText);
        displayText = findViewById(R.id.textBox);
        displayMessages = findViewById(R.id.textBox2);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(responseText.getText().toString());
            }
        });
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == colors.length){
                    count = 0;
                }
                displayMessages.setText(""+colors[count]);
                count+=1;
            }
        });
    }
}
