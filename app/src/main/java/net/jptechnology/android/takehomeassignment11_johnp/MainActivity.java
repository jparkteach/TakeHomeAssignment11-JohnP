package net.jptechnology.android.takehomeassignment11_johnp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

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

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        countriesAdapter = new CountriesAdapter(countries, this);
        recyclerView.setAdapter(countriesAdapter);
    }

    public void addRandomVendor(View view) {
        countries.add(getRandomCountry());
        countriesAdapter.notifyDataSetChanged();
    }

    private Country getRandomCountry() {
        int num = (int) (Math.random() * 6);
        if (num == 0)
            return new Country("United States of America", "Dollar", "English", R.drawable.unitedstates, R.drawable.usdollar);
        else if (num == 1)
            return new Country("South Korea", "Won", "Korean", R.drawable.korea, R.drawable.won);
        else if (num == 2)
            return new Country("China", "Yuon", "Chinese", R.drawable.china, R.drawable.yuon);
        else if (num == 3)
            return new Country("Brazil", "Real", "Portuguese", R.drawable.brazil, R.drawable.real);
        else if (num == 4)
            return new Country("France", "Euro", "French", R.drawable.france, R.drawable.euro);
        else
            return new Country("Japan", "Yen", "Japanese", R.drawable.japan, R.drawable.yen);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                countries.add(getRandomCountry());
                countriesAdapter.notifyDataSetChanged();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
