package Instruments;

import Behavious.IPlay;
import Behavious.ISell;

public class Saxophone extends Instruments implements ISell, IPlay {

    private String saxSize;
    private int saxWeight;

    public Saxophone(String name, String type, String material, double boughtPrice,double sellPrice, String saxSize, int saxWeight) {
        super(name, type, material, boughtPrice, sellPrice);
        this.saxSize = saxSize;
        this.saxWeight = saxWeight;
    }

    public String getSaxSize() {
        return saxSize;
    }

    public int getSaxWeight() {
        return saxWeight;
    }

    public String play() {
        return "Sax sounds";
    }

    public double calculateMarkup(double sellPrice, double boughtPrice) {
        double markup = sellPrice - boughtPrice;
        return markup;
    }
}
