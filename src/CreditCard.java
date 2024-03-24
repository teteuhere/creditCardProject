import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double cash;
    private List<Shopping> shopping;
    
    public CreditCard(double limit) {
        this.limit = limit;
        this.cash = limit;
        this.shopping = new ArrayList<>();
    }

    public boolean shopCard(Shopping shopping){
        if(this.limit>shopping.getValue()){
            this.cash -= shopping.getValue();
            this.shopping.add(shopping);
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

    public List<Shopping> getShopping() {
        return shopping;
    }

    
}
