package pl.bielinski.kofeina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import pl.bielinski.kofeina.coffee.KafelekCoffeeAkcesoria;
import pl.bielinski.kofeina.coffee.KafelekCoffeePrzygotowanie;
import pl.bielinski.kofeina.coffee.KafelekCoffeeRodzaje;
import pl.bielinski.kofeina.coffee.KafelekCoffeeSlowniczek;
import pl.bielinski.kofeina.coffee.KafelekCoffeeZdrowie;

public class Coffee extends AppCompatActivity implements View.OnClickListener {

    public CardView card1;
    public CardView card2;
    public CardView card3;
    public CardView card4;
    public CardView card5;
    public CardView card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        card1 = (CardView) findViewById(R.id.cardViewRodzaje);
        card2 = (CardView) findViewById(R.id.cardViewZdrowie);
        card3 = (CardView) findViewById(R.id.cardViewPrzygotowanie);
        card4 = (CardView) findViewById(R.id.cardViewAkcesoria);
        card5 = (CardView) findViewById(R.id.cardViewSlowniczek);
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
            case R.id.cardViewRodzaje:
                intent = new Intent(this, KafelekCoffeeRodzaje.class);
                startActivity(intent);
                break;
            case R.id.cardViewZdrowie:
                intent = new Intent(this, KafelekCoffeeZdrowie.class);
                startActivity(intent);
                break;
            case R.id.cardViewPrzygotowanie:
                intent = new Intent(this, KafelekCoffeePrzygotowanie.class);
                startActivity(intent);
                break;
            case R.id.cardViewAkcesoria:
                intent = new Intent(this, KafelekCoffeeAkcesoria.class);
                startActivity(intent);
                break;
            case R.id.cardViewSlowniczek:
                intent = new Intent(this, KafelekCoffeeSlowniczek.class);
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