package com.example.intencje;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnFirst, btnSecond, btnThird;
    EditText etAdresUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);
        btnThird = findViewById(R.id.btnThird);
        etAdresUrl = findViewById(R.id.etAdresUrl);

       
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentJawna = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intentJawna);
            }
        });

      
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adres = etAdresUrl.getText().toString();
                Intent intentPrzegladarka =
                        new Intent(Intent.ACTION_VIEW, Uri.parse(adres));
                startActivity(intentPrzegladarka);
            }
        });

      
        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGps = new Intent(MainActivity.this, com.example.intencje.MainActivity3.class);
                startActivity(intentGps);
            }
        });
    }
}
