package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.zip.GZIPOutputStream;

public class Uyg9Activity extends AppCompatActivity {
    EditText Gosterge;
    int sayi;
    Button btnTek,btncift,btnTum;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);
        Gosterge = findViewById(R.id.Gosterge);
        btncift=findViewById(R.id.btnCift);
        btnTek=findViewById(R.id.btnTek);
        btnTum=findViewById(R.id.btnTum);
    }
public void btncift(View view){
    Gosterge.setText("");
    for (int i=0; i<=15; i++){
        if (i%2==0){
            Gosterge.setText(Gosterge.getText()+""+i);
        }
    }
    }
    public void btnTek(View view){
        Gosterge.setText("");
        for (int i=0; i<=15; i++){
            if (i%2==0){
                Gosterge.setText(Gosterge.getText()+"\n"+i);
            }
        }
    }
    public void btnTum(View view){
        Gosterge.setText("");
        for (int i=0; i<=15; i++){
            if (i%2==0){
                Gosterge.setText(Gosterge.getText()+"\n"+i);
            }
        }
    }

}

