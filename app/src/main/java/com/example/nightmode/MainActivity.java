package com.example.nightmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    int currentDayNight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        currentDayNight = AppCompatDelegate.getDefaultNightMode();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (currentDayNight != AppCompatDelegate.getDefaultNightMode()) {
            recreate();
        }
    }

    public void gotoSettingsActivity(View view) {
        startActivity(new Intent(this, SettingsActivity.class));
    }
}
