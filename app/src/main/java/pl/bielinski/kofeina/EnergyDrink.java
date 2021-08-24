package pl.bielinski.kofeina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import pl.bielinski.kofeina.energy.KafelekEnergyAlko;
import pl.bielinski.kofeina.energy.KafelekEnergyDystrybucja;
import pl.bielinski.kofeina.energy.KafelekEnergyHistoria;
import pl.bielinski.kofeina.energy.KafelekEnergyMarki;
import pl.bielinski.kofeina.energy.KafelekEnergyPrzeciwwskazania;

public class EnergyDrink extends AppCompatActivity implements View.OnClickListener{

    public CardView card1;
    public CardView card2;
    public CardView card3;
    public CardView card4;
    public CardView card5;
    public CardView card6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_drink);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        card1 = (CardView) findViewById(R.id.cardViewMarki);
        card2 = (CardView) findViewById(R.id.cardViewDystrybucja);
        card3 = (CardView) findViewById(R.id.cardViewPrzciwwskazania);
        card4 = (CardView) findViewById(R.id.cardViewHistoria);
        card5 = (CardView) findViewById(R.id.cardViewAlko);
        card6 = (CardView) findViewById(R.id.cardViewLicznik);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.cardViewMarki:
                intent = new Intent(this, KafelekEnergyMarki.class);
                startActivity(intent);
                break;
            case R.id.cardViewDystrybucja:
                intent = new Intent(this, KafelekEnergyDystrybucja.class);
                startActivity(intent);
                break;
            case R.id.cardViewPrzciwwskazania:
                intent = new Intent(this, KafelekEnergyPrzeciwwskazania.class);
                startActivity(intent);
                break;
            case R.id.cardViewHistoria:
                intent = new Intent(this, KafelekEnergyHistoria.class);
                startActivity(intent);
                break;
            case R.id.cardViewAlko:
                intent = new Intent(this, KafelekEnergyAlko.class);
                startActivity(intent);
                break;
            case R.id.cardViewLicznik:
                intent = new Intent(this, Licznik.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}