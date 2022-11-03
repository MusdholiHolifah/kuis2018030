package com.example.kuis2018030;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    Button button;
    EditText NameEdit;
    EditText NIMEdit;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            textView = findViewById(R.id.Name);
            textView2 = findViewById(R.id.NIM);
            NameEdit = findViewById(R.id.NameEdit);
            NIMEdit = findViewById(R.id.NIMEdit);

            button = findViewById(R.id.button);

            Mahasiswa s = new ViewModelProvider(this).get(Mahasiswa.class);
            s.getName().observe(this, new Observer<String>() {
                @Override
                public void onChanged(String s) {
                    textView.setText(s);
                }
            });
            s.getNim().observe(this, new Observer<String>() {
                @Override
                public void onChanged(String h) {
                    textView2.setText(h);
                }
            });



            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    s.getName().setValue(String.valueOf(NameEdit.getText()));
                    s.getNim().setValue(String.valueOf(NIMEdit.getText()));



                }
            });

        }
    }