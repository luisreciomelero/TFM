package org.acme.config.entities;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Country implements Serializable {


    private String name;
    private String alpha2Code;
    private String capital;
    private String id;


    public Country(){

    }

    public Country(String name, String alpha2Code, String capital){
        this.name=name;
        this.alpha2Code=alpha2Code;
        this.capital=capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    /*
    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }*/

    @Override
    public String toString() {
        return "Country{" +
                ", name='" + name + '\'' +
                ", alpha2Code='" + alpha2Code + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }
}