package co.jjsolarte.reservaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void onAcercaDe(View view){
        Intent i = new Intent(SplashActivity.this,AcercaDe.class);
        startActivity(i);
    }
}
