package com.mawafaqu.tugassharedpreference;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//Tanggal pengerjaan : 28 April
//Deskripsi Pengerjaan : Mengerjakan seluruh kelas
//10117126
//Mawa Faqu R
//IF-4

import androidx.appcompat.app.AppCompatActivity;

import com.mawafaqu.tugassharedpreference.utils.Preferences;

public class HomeActivity extends AppCompatActivity {

    private TextView txtKeluar;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Clear Set Preferences
                Preferences.setLogout(getBaseContext());

                //Pindah Halaman ke Login
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });

    }

    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}