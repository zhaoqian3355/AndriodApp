package com.example.fragmentbasics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fragmentbasics.fragments.HeadlinesFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_articles);
        if (findViewById(R.id.fragment_container)!=null){
            if (savedInstanceState!=null){
                return;
            }

            HeadlinesFragment firstFragment=new HeadlinesFragment();

            firstFragment.setArguments(getIntent().getExtras());

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container,firstFragment).commit();

        }
    }
}
