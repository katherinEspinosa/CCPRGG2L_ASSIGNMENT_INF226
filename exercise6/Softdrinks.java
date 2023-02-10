public class Softdrinks extends GroceryItem {
    
    public void showItemName () {
        System.out.println(this.name +" is a softdrink");
}

    public void showItemPrice() {
        System.out.println("This "+ this.name +" costs "+ this.price);
}
}