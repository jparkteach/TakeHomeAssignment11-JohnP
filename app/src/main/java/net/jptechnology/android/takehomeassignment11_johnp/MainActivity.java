package net.jptechnology.android.takehomeassignment11_johnp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Country> countries;
    private CountriesAdapter countriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

    }

    private void initialData() {
        countries = new ArrayList<>();
        countries.add(new Country("United States of America", "Dollar", "English", R.drawable.unitedstates, R.drawable.usdollar));
        countries.add(new Country("South Korea", "Won", "Korean", R.drawable.korea, R.drawable.won));
        countries.add(new Country("China", "Yuon", "Chinese", R.drawable.china, R.drawable.yuon));
        countries.add(new Country("Brazil", "Real", "Portuguese", R.drawable.brazil, R.drawable.real));
        countries.add(new Country("France", "Euro", "French", R.drawable.france, R.drawable.euro));
        countries.add(new Country("Japan", "Yen", "Japanese", R.drawable.japan, R.drawable.yen));
    }
}
