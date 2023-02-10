public class App {
    public static void main(String[] args) throws Exception {

        //item in form of a diaper
        // Polymorphic variable (kasi pwede siyang maging diaper or softdrink)
        GroceryItem item1 = new Diaper();
        item1.name = "Huggies";
        item1.price = 100.00;
        item1.showItemName();
        item1.showItemPrice();

        //item in a form of a softdrink
        GroceryItem item2 = new Softdrinks();
        item2.name = "Mountain Dew";
        item2.price = 200.00;
        item2.showItemName();
        item2.showItemPrice();

        // Cashier object
        Cashier c1 = new Cashier();

        // Polymorphic Parameter
        // kaya niyang tumanggap ng kahit na anong Grocery Item
        c1.checkOut(item1);
        c1.checkOut(item2);

        System.out.println("=======================");
        GroceryItem [] itemArray = new GroceryItem[2];

        itemArray[0] = item1;
        itemArray[1] = item2; 

        double totalAmount = 0.00;
        for (int i = 0; i< itemArray.length; i++) {
            itemArray[i].showItemName();
            System.out.println("Price: "+ itemArray[i].price);
            
            totalAmount +=itemArray[i].price;
            //totalAmount = totalAmount + itemArray[i].price
        }
            System.out.println("Total: "+ totalAmount);


            System.out.println("=======================");
        // Pet mypet = new Pet(); 
        Dog myDog = new Dog();
        myDog.eat();
    }
}
