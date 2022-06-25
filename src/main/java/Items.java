import Behavious.ISell;

public class Items implements ISell {

    private String name;
    private double boughtPrice;
    private double sellPrice;

    public Items(String name, double boughtPrice, double sellPrice) {
        this.name = name;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup(double boughtPrice, double sellPrice){
        double markup = sellPrice - boughtPrice;
        return markup;
    }
}
