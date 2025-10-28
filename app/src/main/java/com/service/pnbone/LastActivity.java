package com.service.pnbone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LastActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);
        int form_id = getIntent().getIntExtra("form_id", -1);
        TextView requestId = findViewById(R.id.requestId);
        requestId.setText("Request ID : " + form_id);
    }

    public void GoToHome(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}