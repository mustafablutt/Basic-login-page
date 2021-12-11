package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("On Create Works!!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("On Start Works!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("On Resume Works!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("On Pause Works!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("On Stop Works!!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("On Destroy Works!!!");
    }

    public void Login(View view){

        EditText editText= (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText editText2=(EditText)findViewById(R.id.editTextTextPassword);
        EditText editText3=(EditText)findViewById(R.id.editTextTextEmailAddress4);
        String mymail="mustafa@gmail.com";
        String mypass="mustafa";

        String name=editText.getText().toString();
        if (mypass==editText2.getText().toString() && mymail==editText.getText().toString()){
            System.out.println("Button Click Works!!!");
            Intent intent = new Intent(this,SecondActivity.class);
            intent.putExtra("myEmail",name);
            startActivity(intent);

      } else {

            editText3.setText("Username or Password wrong! ");

        }

    }
}