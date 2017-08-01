package com.diabets.diabetsalfa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class historial extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btnnavigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.calculadora) {
                    Intent int3 = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(int3);

                } else if (item.getItemId() == R.id.registro) {
                    Intent int4 = new Intent(getApplicationContext(), registro.class);
                    startActivity(int4);

                }  else if (item.getItemId() == R.id.historial) {
                    Intent int2 = new Intent(getApplicationContext(), historial.class);
                    startActivity(int2);
                }


                return true;
            }
        });

    }

}
