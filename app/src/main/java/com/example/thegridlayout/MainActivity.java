package com.example.thegridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    This method will be call via button click to send the users name to another screen.
    Any method that the user wants to call from a button
     */
    public void switchScreens(View veiw){
        //make a reference to the EditText in the xml for the page
        EditText editText = findViewById(R.id.editTextTextPersonName);
        // extract the String text from this editText
        String name = editText.getText().toString();

        // Create the intent () and call its constructor and tell it where the
        //intent is coming from (first param) and where it is going (second param)
        Intent intent = new Intent(this,AnotherGrid.class);
        //
        intent.putExtra("textView2", name);
        //
        startActivity(intent);
    }

}