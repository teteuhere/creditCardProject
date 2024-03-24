
public class Shopping implements Comparable<Shopping> {
    private String description;
    private double value;

    public Shopping(String description, double value) {
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
        return "Shopping descriotion is: " + description + 
                "Value is: " + value + "\n";
    }
    @Override
    public int compareTo(Shopping anotherShopping){
        return Double.valueOf(this.value).compareTo(Double.valueOf(anotherShopping));
    }    
}
