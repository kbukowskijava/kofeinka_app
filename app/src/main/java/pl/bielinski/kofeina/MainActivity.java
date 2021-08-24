package pl.bielinski.kofeina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View okNextButton = findViewById(R.id.button_coffe);
        okNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Coffee.class));
            }
        });

        View energy = findViewById(R.id.button_energy);
        energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EnergyDrink.class));
            }
        });

        View yerba = findViewById(R.id.button_yerba);
        yerba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, YerbaMate.class));
            }
        });

        View tabletki = findViewById(R.id.button_tabletki);
        tabletki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Tabletki.class));
            }
        });
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about_program, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.o_programie) {
            startActivity(new Intent(this, AboutProgramActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}