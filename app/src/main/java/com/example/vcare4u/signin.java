package com.example.vcare4u;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class signin extends AppCompatActivity {
    EditText ed1,pd1;
    Button b1,b2;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        ed1=(EditText)findViewById(R.id.ed1);
        pd1=(EditText) findViewById(R.id.pd1);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);


        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s1 = ed1.getText().toString();
                s2 = pd1.getText().toString();
                if ((s1.equals("sindhuja")) && (s2.equals("sagi"))) {
                    Intent i = new Intent(getApplicationContext(), homepage.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Redirecting", Toast.LENGTH_SHORT).show();
                }
            }

        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ed1.setText("");
                pd1.setText("");
            }
        });

    }
}
