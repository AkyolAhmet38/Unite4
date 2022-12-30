package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Gold2  extends AppCompatActivity {
    public int tek2 = 0;
    public int cift2 = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_goldsoru);
        EditText txt = findViewById(R.id.G2txtSayi);
        TextView tek = findViewById(R.id.tek);
        TextView cift = findViewById(R.id.cift);
        Button btn = findViewById(R.id.G2btnHesapla);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi = Integer.parseInt(txt.getText().toString());
                tek.setText("");
                cift.setText("");
                for(int i = 1;i <= sayi;i++)
                {
                    if(i % 2 == 0)
                    {
                        cift.setText(cift.getText().toString() + "\n" + (cift2 + i));
                        cift2 = cift2 + i;
                    }
                    else
                    {
                        tek.setText(tek.getText().toString() + "\n" + (tek2 + i));
                        tek2 = tek2 + i;
                    }
                }
            }
        });
    }
}

