package com.daffzzaqihaq.zikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnKlikMasuk(View view) {
        Intent pindah = new Intent(MainActivity.this, choseActivity.class);
        startActivity(pindah);
    }

    public void btnKlikSupport(View view) {
        Intent pindah = new Intent(MainActivity.this, idontknow.class);
        startActivity(pindah);
    }
}
