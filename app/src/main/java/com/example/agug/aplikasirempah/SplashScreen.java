package com.example.agug.aplikasirempah;

import android.content.Intent;
import android.example.com.aplikasirempah.MainActivity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(SplashScreen.class.getSimpleName(), "Oncreate");

        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashScreen.this, HalamanUser.class));
                finish();

            }
        }, 3000);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(SplashScreen.class.getSimpleName(), "Onstart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(SplashScreen.class.getSimpleName(), "OnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(SplashScreen.class.getSimpleName(), "OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(SplashScreen.class.getSimpleName(), "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(SplashScreen.class.getSimpleName(), "OnDestroy");
    }
}
