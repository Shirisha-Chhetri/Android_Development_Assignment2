package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    EditText e;
    Button bt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        e = findViewById(R.id.num);
        bt = findViewById(R.id.btn1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone=e.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("phone",phone);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}