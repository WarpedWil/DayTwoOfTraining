package com.example.daytwooftraining;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.app.ActionBar;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String MY_FIRST_LOG = "my_first_log";

//    identifying
//    out the activity methods, but inside the class global view variables
    TextView mHelloTextView;
    Button mExampleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      Initialize
        mHelloTextView = findViewById(R.id.hello_tv);
        mExampleButton = findViewById(R.id.example_button);
        //first use of log levels to be found in Logcat window
        Log.d(MY_FIRST_LOG, "My app just started");

        EditText editText= new EditText(this);
//        editText.setWidth(ConstraintSet.Layout.LayoutParams.MATCH_PARENT);
//        editText.setHeight(ConstraintSet.Layout.LayoutParams.MATCH_PARENT);
//        editText.setHint("type here");

    }

    public void buttonClicked(View view) {
        mHelloTextView.setText("Goodbye World");
        //Common display item: toast
        Toast.makeText(this, "This is just a Toast", Toast.LENGTH_LONG).show();
    }
}