package com.example.attemptnumdber3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashscreen extends Activity {
    private final int SPLASH_DISPLEY_LENGHT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Splashscreen.this,MainActivity.class);
                Splashscreen.this.startActivity(mainIntent);
                Splashscreen.this.finish();
            }
        },SPLASH_DISPLEY_LENGHT);
    }
     @Override
    public void onBackPressed(){  //Обратно на экране телефона.
        super.onBackPressed();
     }

}
