package Instruments;

import Behavious.IPlay;
import Behavious.ISell;

public abstract class Instruments{

    private String name;
    private String type;
    private String material;
    private double boughtPrice;
    private double sellPrice;

    public Instruments(String name, String type, String material, double boughtPrice, double sellPrice) {
        this.name = name;
        this.type = type;
        this.material = material;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice(){
        return sellPrice;
    }

}
