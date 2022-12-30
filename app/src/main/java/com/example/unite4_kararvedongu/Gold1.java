package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Gold1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_goldsoru);
        Button goldbtn = findViewById(R.id.goldbtn);
        TextView yazilacak = findViewById(R.id.txtgold1);
        EditText yazilan = findViewById(R.id.txtmulti);
        goldbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yazilacak.setText(" ");
                for (int i = 1;i <= 10; i++)
                {
                    yazilacak.setText(yazilacak.getText().toString() + "\n" + yazilan.getText().toString() + " x " + i + " = " + Integer.parseInt(yazilan.getText().toString()) * i);
                }
            }
        });
    }
}
