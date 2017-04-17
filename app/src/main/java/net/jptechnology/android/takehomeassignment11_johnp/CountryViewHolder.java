package net.jptechnology.android.takehomeassignment11_johnp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CountryViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView countryNameView;
    private TextView countryCurrencyView;
    private TextView countryLanguageView;
    private ImageView countryPhotoView;
    private ImageView countryCurrencyLogoView;
    private Context context;

    public CountryViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        countryNameView = (TextView) itemView.findViewById(R.id.country_name);
        countryCurrencyView = (TextView) itemView.findViewById(R.id.country_currency);
        countryLanguageView = (TextView) itemView.findViewById(R.id.country_language);
        countryPhotoView = (ImageView) itemView.findViewById(R.id.country_logo);
        countryCurrencyLogoView = (ImageView) itemView.findViewById(R.id.country_currency_logo);
        this.context = context;
    }

    public void bind(final Country country) {
        countryNameView.setText(country.name);
        countryCurrencyView.setText(country.currency);
        countryLanguageView.setText(country.language);
        countryPhotoView.setImageResource(country.countryPhoto);
        countryCurrencyLogoView.setImageResource(country.currencyLogo);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Country passcountry = new Country(country.name, country.currency, country.language,
                        country.countryPhoto, country.currencyLogo);
                Intent intent = SecondActivity.makeIntent(context, passcountry);
                context.startActivity(intent);
                Toast.makeText(context, countryNameView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
