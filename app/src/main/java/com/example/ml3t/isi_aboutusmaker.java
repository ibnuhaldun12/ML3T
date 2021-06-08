package com.example.ml3t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class isi_aboutusmaker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_aboutusmaker);
    }

    public void cellphone(View view) {
        Uri uri = Uri.parse("tel:082293209135");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ibnuhaldun12@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari aplikasi android");

        try {
            startActivity(Intent.createChooser(intent, "Ingin mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}