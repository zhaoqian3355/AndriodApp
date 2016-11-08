package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.MyFirstApp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.HONEYCOMB){
//
//        }
//
//        if(findViewById(R.id.fragment_container)!=null){
//            if (savedInstanceState!=null){
//                return;
//            }
//
//            HeadlinesFragment firstFragment=new HeadlinesFragment();
//
//            firstFragment.setArguments(getIntent().getExtras());
//
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.fragment_container,firstFragment).commit();
//        }

    }

    public void sendMessage(View view){
        Intent intent=new Intent(this,DisplayMessageActivity.class);
        EditText editText=(EditText)findViewById(R.id.edit_message);
        String message=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}