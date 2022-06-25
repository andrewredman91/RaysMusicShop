import Behavious.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<ISell> getStockCount(){
        return stock;
    }

    public void addToStock(ISell product){
        stock.add(product);
    }

    public void removeStock(ISell product){
        stock.remove(product);
    }
}
