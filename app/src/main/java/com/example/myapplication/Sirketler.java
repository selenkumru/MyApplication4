package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Sirketler extends AppCompatActivity {
    public Button btn_banka1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sirketler);
        btn_banka1 = findViewById(R.id.Banka1_Button);
        btn_banka1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent sıraListesi = new Intent(Sirketler.this,Sira_Listesi.class);
        startActivity(sıraListesi);
    }
});
    }


}