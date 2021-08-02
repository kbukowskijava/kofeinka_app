package pl.bielinski.kofeina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Licznik extends AppCompatActivity {

    private Button Oblicz;
    private EditText kilogramy;
    private EditText miligramy;

    private TextView wynik;

    private TextView opinia;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licznik);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Oblicz = (Button) findViewById(R.id.button_liczenie_kofeiny);
        kilogramy = (EditText) findViewById(R.id.Wpisz_ilosc_kg);
        miligramy = (EditText) findViewById(R.id.Wpisz_ilosc_kofeiny);

        wynik = (TextView) findViewById((R.id.Wynik_masa_div_kofeina));
        opinia = (TextView) findViewById((R.id.Wyswietlenie_opinii));


        Oblicz.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(TextUtils.isEmpty(kilogramy.getText().toString()) && TextUtils.isEmpty(miligramy.getText().toString()))
                {
                    kilogramy.setError("To pole nie moze byc puste!");
                    miligramy.setError("To pole nie moze byc puste!");
                }
                else if(TextUtils.isEmpty(miligramy.getText().toString()))
                {
                    miligramy.setError("To pole nie moze byc puste!");
                }
                else if(TextUtils.isEmpty(kilogramy.getText().toString())){
                    kilogramy.setError("To pole nie moze byc puste!");
                }
                else
                {
                    float num1 = Integer.parseInt(kilogramy.getText().toString());
                    float num2 = Integer.parseInt(miligramy.getText().toString());

                    if(num1==0)
                    {
                        Toast.makeText(getBaseContext(),"Twoja waga nie może wynosić 0 kg", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        float result = (num2 / num1);

                        if(result<=15)
                        {
                            opinia.setText("Pikobelo");
                        }
                        else if(result>15 && result<=25)
                        {
                            opinia.setText("Coś jest na rzeczy");
                        }
                        else if(result>25 && result<=50)
                        {
                            opinia.setText("Przystopój");
                        }
                        else if(result>50 && result<=150)
                        {
                            opinia.setText("Straż jest, ale nie gasi");
                        }
                        else
                        {
                            opinia.setText("Dzwoń na 112");
                        }
                        wynik.setText(String.valueOf(result));
                    }
                }
            }
        });
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