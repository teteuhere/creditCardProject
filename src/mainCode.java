import java.util.Collections;
import java.util.Scanner;

public class mainCode() {
    public static void main(String[] args){
        Scanner read = new  Scanner(System.in);
        System.out.println("Enter you credit card limit: ");
        double cclimit = read.nextDouble();
        creditCard card = new creditCard(cclimit);

        int exit = 1;
        while(exit !=0){
            System.out.println("Type the description of the product: ");
            String description = read.next();
            System.out.println("Type the value of the product: ");
            double value = read.nextDouble();
            shopList shop = new shopList(description,value);
            boolean successful = card.addShop(shop);
            if (successful) {
                System.out.println("The transaction was successful");
                System.out.println("type 0 to exit or 1 to continue.");
                exit = read.nextInt();
            } else {
                System.out.println("You dont have enough balance");
                exit = 0;
            }
        }
        System.out.println("-------------------");
        System.out.println("Transactions: \n");
        Collections.sort(card.getShopList());
        for (Shop s : card.getShopList()){
            System.out.println(s.getDescription() + " - " + s.getValue());
        }
        System.out.println("\n-------------------");
        System.out.println("Balance: " + card.getCash);
    }
}