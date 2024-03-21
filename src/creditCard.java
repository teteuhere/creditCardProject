import java.util.ArrayList;
import java.util.List;

public class creditCard {
    private double limit;
    private double cash;
    private List<shopList> shopList;
    
    public creditCard(double limit) {
        this.limit = limit;
        this.cash = limit;
        this.shopList = new ArrayList<>();
    }

    public boolean shopCard(shopList shopList){
        if(this.limit>shopList.getValue()){
            this.cash -= shopList.getValue();
            this.shopList.add(purchase);
            return true;
        } 
        return false;
    }
    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return cash;
    }

    public List<shopList> getShopList() {
        return shopList;
    }

    
}
