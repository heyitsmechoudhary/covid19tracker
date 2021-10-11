package com.rahul.covid19_tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private int positionCountry;
    TextView tvCases,tvRecover,tvTodaycases,tvTotaldeaths,tvTodaydeath,tvActive,tvCritical,tvCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);
        getSupportActionBar().setTitle("Details of"+ AffectedCountries.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tvCases = findViewById(R.id.tvCases);
        tvCountry = findViewById(R.id.tvCountry);
        tvRecover = findViewById(R.id.tvRecover);
        tvTodaycases = findViewById(R.id.tvTodaycases);
        tvTotaldeaths = findViewById(R.id.tvTotaldeaths);
        tvTodaydeath = findViewById(R.id.tvTodaydeath);
        tvActive = findViewById(R.id.tvActive);
        tvCritical = findViewById(R.id.tvCritical);

        tvCountry.setText(AffectedCountries.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelList.get(positionCountry).getCases());
        tvRecover.setText(AffectedCountries.countryModelList.get(positionCountry).getRecovered());
        tvTodaycases.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayCases());
        tvTotaldeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getDeaths());
        tvTodaydeath.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayDeath());
        tvActive.setText(AffectedCountries.countryModelList.get(positionCountry).getActive());
        tvCritical.setText(AffectedCountries.countryModelList.get(positionCountry).getCritical());
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}