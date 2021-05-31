package com.example.vcare4u;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class homepage extends AppCompatActivity {
    Button b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        b3=(Button)findViewById(R.id.register);
        b4=(Button)findViewById(R.id.bookschedule);
        b5=(Button)findViewById(R.id.faqs);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), register.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "loading", Toast.LENGTH_LONG).show();


            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),bookschedule.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "book your slots", Toast.LENGTH_LONG).show();

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), faq.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "clear your doubts", Toast.LENGTH_LONG).show();


            }
        });

    }
}