package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
EditText txtasa;
TextView sonuc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);

        txtasa = findViewById(R.id.txtasa);
        sonuc = findViewById(R.id.sonuc);
    }
    public void btnasdfgf (View view){
        int asa = Integer.parseInt(txtasa.getText().toString());
        int sayac = 1;
        long sonuc =1;

        while (sayac <= asa){
            sonuc = sonuc * sayac;
            sayac++;
        }
        //sonuc.setText("sonuc:" + sonuc);
    }
}
