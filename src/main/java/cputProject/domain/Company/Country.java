package cputProject.domain.Company;

public class Country {

    private String countryCode;
    private String countryName;

    private Country(){}

    private Country(Builder builder){
        this.countryCode = builder.countryCode;
        this.countryName = builder.countryName;
    }

    public String getCountryCode(){return countryCode;}
    public String getCountryName(){return  countryName;}


    public static class Builder{
         private String countryCode;
         private String countryName;

         public Builder countreyCode(String countryCode){
             this.countryCode = countryCode;
             return this;
         }

         public Builder countryName(String countryName){
             this.countryName = countryName;
             return this;
         }

         public Country build(){return new Country(this);}
    }
}
