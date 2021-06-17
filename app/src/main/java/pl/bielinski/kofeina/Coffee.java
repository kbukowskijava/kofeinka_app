package pl.bielinski.kofeina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

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

        card1 = (CardView) findViewById(R.id.cardView1);
        card2 = (CardView) findViewById(R.id.cardView2);
        card3 = (CardView) findViewById(R.id.cardView3);
        card4 = (CardView) findViewById(R.id.cardView4);
        card5 = (CardView) findViewById(R.id.cardView5);
        card6 = (CardView) findViewById(R.id.cardView6);

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
            case R.id.cardView1:
                intent = new Intent(this,KafelekCoffee.class);
                startActivity(intent);
                break;
            case R.id.cardView2:
                intent = new Intent(this,KafelekCoffee.class);
                startActivity(intent);
                break;
            case R.id.cardView3:
                intent = new Intent(this,KafelekCoffee.class);
                startActivity(intent);
                break;
            case R.id.cardView4:
                intent = new Intent(this,KafelekCoffee.class);
                startActivity(intent);
                break;
            case R.id.cardView5:
                intent = new Intent(this,KafelekCoffee.class);
                startActivity(intent);
                break;
            case R.id.cardView6:
                intent = new Intent(this,KafelekCoffee.class);
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