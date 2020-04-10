package org.example;

public class CarsTemplate {

    String carbrand;
    String carmodel;
    int year;
    String engine;
    String variant;

    public String carinfo()
    {
        String info = carbrand + " " + carmodel + " " + year + " " + engine + " " + variant;
        return info;
    }

}
