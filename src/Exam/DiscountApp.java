package Exam;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", null, true);
        double price1 = 1100;

        Client client2 = new Client(null, null, false);
        double price2 = 1100;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        Presentation print = new Presentation();
        String print1 = print.printInformation(client1.getFirstName(), client1.getLastName());
        String print2 = print.printInformation(client2.getFirstName(), client2.getLastName());

        System.out.println(print1);
        System.out.println("Kwota przed rabatem: " + price1);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount1);

        System.out.println(print2);
        System.out.println("Kwota przed rabatem: " + price2);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount2);
    }
}
