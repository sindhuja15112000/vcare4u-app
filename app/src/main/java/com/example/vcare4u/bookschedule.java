package com.example.vcare4u;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class bookschedule extends Activity implements OnClickListener
{EditText Name,Hospital,Da,TimeSlot;
    Button Insert,Delete,Update,View;
    SQLiteDatabase db;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookschedule);
        Name=(EditText)findViewById(R.id.Name);
        Hospital=(EditText)findViewById(R.id.Hospital);
        Da=(EditText)findViewById(R.id.Da);
        TimeSlot=(EditText)findViewById(R.id.TimeSlot);
        Insert=(Button)findViewById(R.id.Insert);
        Delete=(Button)findViewById(R.id.Delete);
        Update=(Button)findViewById(R.id.Update);
        View=(Button)findViewById(R.id.View);

        Insert.setOnClickListener(this);
        Delete.setOnClickListener(this);
        Update.setOnClickListener(this);
        View.setOnClickListener(this);


        // Creating database and table
        db=openOrCreateDatabase("StudentDB1", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS stu(name VARCHAR,hospital VARCHAR,da VARCHAR,timeslot VARCHAR,primary key(name));");

    }



    public void onClick(View view)
    {
        // Inserting a record to the Student table
        if(view==Insert)
        {
            // Checking for empty fields
            if(Name.getText().toString().trim().length()==0||
                    Hospital.getText().toString().trim().length()==0||
                    Da.getText().toString().trim().length()==0||
                    TimeSlot.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter all values");
                return;
            }
            db.execSQL("INSERT INTO stu VALUES('"+Name.getText()+"','"+Hospital.getText()+"','"+Da.getText()+"','"+TimeSlot.getText()+"');");
            showMessage("Success", "slot allocated");
            clearText();
            db.execSQL("INSERT INTO stu VALUES('"+Name.getText()+"','"+Hospital.getText()+"','"+Da.getText()+"','"+TimeSlot.getText()+"')");
        }
        // Deleting a record from the Student table
        if(view==Delete)
        {

            if(Name.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter Name");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM stu WHERE name='"+Name.getText()+"'",
                    null);
            if(c.moveToFirst())
            {
                db.execSQL("DELETE FROM stu WHERE name='"+Name.getText()+"'");
                showMessage("Success", "Deleted");
            }
            else
            {
                showMessage("Error", "Invalid Name");
            }
            clearText();
        }
        // Updating a record in the Student table
        if(view==Update)
        {

            if(Name.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter Name");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM stu WHERE name='"+Name.getText()+"'",
                    null);
            if(c.moveToFirst()) {
                db.execSQL("UPDATE stu SET hospital='" + Hospital.getText() + "',date='" + Da.getText() + "',timeslot='" + TimeSlot.getText() + "' WHERE rollno='"+Name.getText()+"'");
                showMessage("Success", "Updated");
            }
            else {
                showMessage("Error", "Invalid Name");
            }
            clearText();
        }
        // Display a record from the Student table
        if(view==View)
        {
            // Checking for empty roll number
            if(Name.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter Name");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM stu WHERE name='"+Name.getText()+"'",
                    null);
            if(c.moveToFirst())
            {
                Hospital.setText(c.getString(1));
                Da.setText(c.getString(2));
                TimeSlot.setText(c.getString(3));
            }
            else
            {
                showMessage("Error", "Invalid Name");
                clearText();
            }
        }
        // Displaying all the records

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
        Hospital.setText("");
        Da.setText("");
        TimeSlot.setText("");
        Name.requestFocus();
    }

}


