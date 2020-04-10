package org.example;

public class App 
{
    public static void main( String[] args )
    {
    CarsTemplate bmw = new CarsTemplate();
    bmw.carbrand = "BMW";
    bmw.carmodel = "325";
    bmw.engine = "petrol";
    bmw.variant = "sedan";
    bmw.year = 1995;

    System.out.println("Your car is : " + bmw.carinfo());

    CarsTemplate audi = new CarsTemplate();
    audi.year = 2018;
    audi.carmodel = "AUDI";
    audi.carbrand = "A6";
    audi.engine = "diesel";
    audi.variant = "coupe";

    System.out.println("Your car is : " + audi.carinfo());

    }
}
