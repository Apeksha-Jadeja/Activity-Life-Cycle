package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
private static final String TAG="Message";

Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.i(TAG,"onCreate method is called");

        button=findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*//method 1
                Intent i=new Intent(getApplicationContext(),AcitivityB.class);
                startActivity(i);*/

                //method 2
                GoToActivityB();
            }
        });

        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse("https://play.google.com/store/apps/details?id=coders.hub.android.master&hl=en&gl=US"));
                startActivity(i2);
            }
        });

    }

    private void GoToActivityB() {
        Intent i=new Intent(this,AcitivityB.class);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart method is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart method is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume method is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause method is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy method is called");
    }
}