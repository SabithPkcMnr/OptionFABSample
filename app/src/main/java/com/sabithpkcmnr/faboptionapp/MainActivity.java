package com.sabithpkcmnr.faboptionapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.joaquimley.faboptions.FabOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        final FabOptions fabOptions = (FabOptions) findViewById(R.id.fab_options);
        fabOptions.setButtonsMenu(R.menu.fab_menu);
        fabOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.faboptions_umbrella:
                        Toast.makeText(MainActivity.this, "Chill at the Beach", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.faboptions_brush:
                        Toast.makeText(MainActivity.this, "Let's draw", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.faboptions_monetization:
                        Toast.makeText(MainActivity.this, "Dollars Man!!", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.faboptions_hot:
                        Toast.makeText(MainActivity.this, "What's Hot?", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        Toast.makeText(MainActivity.this, "Something went wrong...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}