package com.kingwanyama.customspinner;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ArrayList<CountryItem> mCountryList;
    CountryAdapter mAdapter;
    Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
        mSpinner = findViewById(R.id.spinner_countries);
        mAdapter = new CountryAdapter(this,mCountryList);
        mSpinner.setAdapter(mAdapter);
        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CountryItem clickedItem = (CountryItem) adapterView.getItemAtPosition(i);
                String clickedCountryItem = clickedItem.getmCountryName();
                Toast.makeText(MainActivity.this, clickedCountryItem, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void initList(){
        mCountryList = new ArrayList<>();
        mCountryList.add(new CountryItem("Kenya",R.drawable.kenya));
        mCountryList.add(new CountryItem("Uganda",R.drawable.uganda));
        mCountryList.add(new CountryItem("Tanzania",R.drawable.tanzania));
        mCountryList.add(new CountryItem("Rwanda",R.drawable.rwanda));
        mCountryList.add(new CountryItem("Burundi",R.drawable.burundi));
        mCountryList.add(new CountryItem("Nigeria",R.drawable.nigeria));

    }
}
