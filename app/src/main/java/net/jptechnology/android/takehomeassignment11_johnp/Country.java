package net.jptechnology.android.takehomeassignment11_johnp;

public class Country {
    public String name;
    public String currency;
    public String language;
    public int countryPhoto;
    public int currencyLogo;

    public Country(String name, String currency, String language, int countryPhoto, int currencyLogo) {
        this.name = name;
        this.currency = currency;
        this.language = language;
        this.countryPhoto = countryPhoto;
        this.currencyLogo = currencyLogo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getCountryPhoto() {
        return countryPhoto;
    }

    public void setCountryPhoto(int countryPhoto) {
        this.countryPhoto = countryPhoto;
    }

    public int getCurrencyLogo() {
        return currencyLogo;
    }

    public void setCurrencyLogo(int currencyLogo) {
        this.currencyLogo = currencyLogo;
    }
}


