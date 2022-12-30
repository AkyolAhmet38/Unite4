package com.example.unite4_kararvedongu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void btnUyg1Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg1Activity.class);
        startActivity(i);
    }

    public void btnUyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2Activity.class);
        startActivity(i);
    }

    public void btnUyg3Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg3Activity.class);
        startActivity(i);
    }

    public void btnUyg4Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg4Activity.class);
        startActivity(i);
    }

    public void btnUyg5Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg5Activity.class);
        startActivity(i);
    }

    public void btnUyg6Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg6Activity.class);
        startActivity(i);
    }
    public void btnUyg7Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg7Activity.class);
        startActivity(i);
    }

    public void btnUyg8Goster(View view)
    {
        Intent i = new Intent(MainActivity.this, Uyg8Activity.class);
        startActivity(i);
    }
    public void btnUyg9Goster(View view)
    {
        Intent i = new Intent(MainActivity.this, Uyg9Activity.class);
        startActivity(i);
    }
    public void asd(View view)
    {
        Intent a = new Intent(MainActivity.this,Gold1.class);
        startActivity(a);
    }
    public void asdf(View view)
    {
        Intent j = new Intent(MainActivity.this,Gold2.class);
        startActivity(j);
    }
}