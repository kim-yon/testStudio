package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edit_ID;
    private EditText edit_PA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_ID = (EditText) findViewById(R.id.edit_ID);
        edit_PA = (EditText) findViewById(R.id.edit_PA);

        edit_ID.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int Id, KeyEvent event) {
                if(Id == EditorInfo.IME_ACTION_DONE || Id == EditorInfo.IME_NULL){
                    return true;
                }
                return false;
            }
        });

        edit_PA.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int Id, KeyEvent event) {
                if(Id == EditorInfo.IME_ACTION_DONE || Id == EditorInfo.IME_NULL) {
                    return true;
                }
                return false;
            }
        });

        Button btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}