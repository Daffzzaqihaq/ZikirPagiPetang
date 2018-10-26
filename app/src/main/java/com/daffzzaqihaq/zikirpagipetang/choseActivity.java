package com.daffzzaqihaq.zikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class choseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose);
    }

    public void btnKlikPagi(View view) {
        Intent pindah = new Intent(choseActivity.this, DzikirPagiActivity.class);
        startActivity(pindah);
    }

    public void btnKlikPetang(View view) {
        Intent pindah = new Intent(choseActivity.this, DzikirPetangActivity.class);
        startActivity(pindah);
    }
}
