package com.wahid.evaluasikelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Selamat Datang Di IKONS",Toast.LENGTH_SHORT).show();
                Intent contentIntent = new Intent(MainActivity.this, ContentActivity.class);
                startActivity(contentIntent);

            }
        });
    }
}