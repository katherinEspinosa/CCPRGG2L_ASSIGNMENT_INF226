public class Cashier {
    
    double price;

    public void checkOut(GroceryItem item){
        System.out.println("You have purchased "+ item.name);

    }

    public void showItemPrice(GroceryItem item, GroceryItem price) {
        System.out.println("This "+ item.name +" costs"+ item.price);
    }
}
