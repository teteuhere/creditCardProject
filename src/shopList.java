
public class shopList {
    private String description;
    private double value;
    public shopList(String description, double value) {
        this.description = description;
        this.value = value;
    }
    public String getDescription() {
        return description;
    }
    public double getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Shotplist = " + description + 
                "Value is = " + value + "\n";
    }
    @Override
    public int compareTo()
    
}
