package com.example.vcare4u;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class register extends Activity implements OnClickListener
{EditText Name,Emailid,Age,Gender,Phone,Aadhar,Vaccine;
    Button Insert;
    SQLiteDatabase db;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Name=(EditText)findViewById(R.id.Name);
        Emailid =(EditText)findViewById(R.id.Emailid);
        Age=(EditText)findViewById(R.id.Age);
        Gender=(EditText)findViewById(R.id.Gender);
        Phone=(EditText)findViewById(R.id.Phone);
        Aadhar=(EditText)findViewById(R.id.Aadhar);
        Vaccine=(EditText)findViewById(R.id.Vaccine);

        Insert=(Button)findViewById(R.id.Insert);
        Insert.setOnClickListener(this);
        // Creating database and table
        db=openOrCreateDatabase("StudentDB1", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS st(name VARCHAR,email VARCHAR,age VARCHAR,gender VARCHAR,phone VARCHAR,aadhar VARCHAR,vaccine VARCHAR,primary key(name));");

    }

    public void onClick(View view)
    {
        // Inserting a record to the Student table
        if(view==Insert)
        {
            // Checking for empty fields
            if(Name.getText().toString().trim().length()==0||
                    Emailid.getText().toString().trim().length()==0||
                    Age.getText().toString().trim().length()==0||
                    Gender.getText().toString().trim().length()==0||
                    Phone.getText().toString().trim().length()==0||
                    Aadhar.getText().toString().trim().length()==0||
                    Vaccine.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter all values");
                return;
            }
            db.execSQL("INSERT INTO st VALUES('"+Name.getText()+"','"+Emailid.getText()+"','"+Age.getText()+"','"+Gender.getText()+"','"+Phone.getText()+"','"+Aadhar.getText()+"','"+Vaccine.getText()+"')");
            showMessage("Success", "Registered Successfully");
            clearText();
            db.execSQL("INSERT INTO st VALUES('"+Name.getText()+"','"+Emailid.getText()+"','"+Age.getText()+"','"+Gender.getText()+"','"+Phone.getText()+"','"+Aadhar.getText()+"','"+Vaccine.getText()+"')");
        }

    }
    public void showMessage(String title,String message)
    {
        Builder builder=new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    public void clearText()
    {
        Name.setText("");
        Emailid.setText("");
        Age.setText("");
        Gender.setText("");
        Phone.setText("");
        Aadhar.setText("");
        Vaccine.setText("");

        Name.requestFocus();
    }

}
