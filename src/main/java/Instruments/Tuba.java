package Instruments;

import Behavious.IPlay;
import Behavious.ISell;

public class Tuba extends Instruments implements ISell, IPlay {

    private int tubaWeight;

    public Tuba(String name, String type, String material, double boughtPrice, double sellPrice, int tubaWeight) {
        super(name, type, material, boughtPrice, sellPrice);
        this.tubaWeight = tubaWeight;
    }

    public int getTubaWeight() {
        return tubaWeight;
    }

    public String play() {
        return "Tuba sounds";
    }

    public double calculateMarkup(double sellPrice, double boughtPrice) {
        double markup = sellPrice - boughtPrice;
        return markup;
    }

    public String getTubaSize() {
        return getTubaSize();
    }

    public int getSaxWeight() {
        return getTubaWeight();
    }
}

