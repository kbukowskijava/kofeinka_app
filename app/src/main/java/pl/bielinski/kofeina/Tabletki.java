package pl.bielinski.kofeina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import pl.bielinski.kofeina.tabletki.KafelekTabletkiDystrybucja;
import pl.bielinski.kofeina.tabletki.KafelekTabletkiHistoria;
import pl.bielinski.kofeina.tabletki.KafelekTabletkiMarki;
import pl.bielinski.kofeina.tabletki.KafelekTabletkiSkutki;
import pl.bielinski.kofeina.tabletki.KafelekTabletkiZalety;
import pl.bielinski.kofeina.yerba.KafelekYerbaAkcesoria;
import pl.bielinski.kofeina.yerba.KafelekYerbaHistoria;
import pl.bielinski.kofeina.yerba.KafelekYerbaPrzygotowanie;
import pl.bielinski.kofeina.yerba.KafelekYerbaRodzaje;
import pl.bielinski.kofeina.yerba.KafelekYerbaZdrowie;

public class Tabletki extends AppCompatActivity implements View.OnClickListener{


    public CardView card1;
    public CardView card2;
    public CardView card3;
    public CardView card4;
    public CardView card5;
    public CardView card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabletki);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        card1 = (CardView) findViewById(R.id.cardViewMarki);
        card2 = (CardView) findViewById(R.id.cardViewOpis);
        card3 = (CardView) findViewById(R.id.cardViewSkutkiUboczne);
        card4 = (CardView) findViewById(R.id.cardViewZalety);
        card5 = (CardView) findViewById(R.id.cardViewDystrybucja);
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
                intent = new Intent(this, KafelekTabletkiMarki.class);
                startActivity(intent);
                break;
            case R.id.cardViewOpis:
                intent = new Intent(this, KafelekTabletkiHistoria.class);
                startActivity(intent);
                break;
            case R.id.cardViewSkutkiUboczne:
                intent = new Intent(this, KafelekTabletkiSkutki.class);
                startActivity(intent);
                break;
            case R.id.cardViewZalety:
                intent = new Intent(this, KafelekTabletkiZalety.class);
                startActivity(intent);
                break;
            case R.id.cardViewDystrybucja:
                intent = new Intent(this, KafelekTabletkiDystrybucja.class);
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