package net.jptechnology.android.takehomeassignment11_johnp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String EXTRA_NAME = "net.jptechnology.android.takehomeassignment11_johnp.SecondActivity - countryName";
    private static final String EXTRA_CURRENCY = "net.jptechnology.android.takehomeassignment11_johnp.SecondActivity - countryCurrency";
    private static final String EXTRA_LANGUAGE = "net.jptechnology.android.takehomeassignment11_johnp.SecondActivity - countryLanguage";
    private static final String EXTRA_PHOTO = "net.jptechnology.android.takehomeassignment11_johnp.SecondActivity - countryPhoto";
    private static final String EXTRA_CURRENCY_LOGO = "net.jptechnology.android.takehomeassignment11_johnp.SecondActivity - countryCurrencyLogo";


    private Country country2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        extractDataFromIntent();

        setupEndActivityButton();
    }

    private void extractDataFromIntent() {
        Intent intent = getIntent();
        String countryName = intent.getStringExtra(EXTRA_NAME);
        String countryCurrency = intent.getStringExtra(EXTRA_CURRENCY);
        String countryLanguage = intent.getStringExtra(EXTRA_LANGUAGE);
        int countryPhoto = intent.getIntExtra(EXTRA_PHOTO, 0);
        int countryCurrencyLogo = intent.getIntExtra(EXTRA_CURRENCY_LOGO, 0);
        country2 = new Country(countryName, countryCurrency, countryLanguage, countryPhoto, countryCurrencyLogo);
    }

    private void setupEndActivityButton() {
        Button button = (Button) findViewById(R.id.close);
        ImageView countryPhotoView = (ImageView) findViewById(R.id.country_logo2);
        ImageView countryCurrencyLogoView = (ImageView) findViewById(R.id.country_currency_logo2);
        TextView countryNameView = (TextView) findViewById(R.id.country_name2);
        TextView countryCurrencyView = (TextView) findViewById(R.id.country_currency_2);
        TextView countryLanguageView = (TextView) findViewById(R.id.country_language_2);
        countryPhotoView.setImageResource(country2.getCountryPhoto());
        countryCurrencyLogoView.setImageResource(country2.getCurrencyLogo());
        countryNameView.setText(country2.getName());
        countryCurrencyView.setText(country2.getCurrency());
        countryLanguageView.setText(country2.getLanguage());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public static Intent makeIntent(Context context, Country country) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra(EXTRA_NAME, country.getName());
        intent.putExtra(EXTRA_CURRENCY, country.getCurrency());
        intent.putExtra(EXTRA_LANGUAGE, country.getLanguage());
        intent.putExtra(EXTRA_PHOTO, country.getCountryPhoto());
        intent.putExtra(EXTRA_CURRENCY_LOGO, country.getCurrencyLogo());
        return intent;
    }
}
