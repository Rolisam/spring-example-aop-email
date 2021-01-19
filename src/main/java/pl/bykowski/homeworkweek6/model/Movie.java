package pl.bykowski.homeworkweek6.model;

import javax.xml.crypto.Data;

public class Movie {

    private String name;
    private String producer;
    private String year;

    public Movie(String name, String producer, String year) {
        this.name = name;
        this.producer = producer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
