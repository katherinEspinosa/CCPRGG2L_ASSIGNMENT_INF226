public class Car {

    //ATTRIBUTES
    String name;
    String color;
    //lalagyan ng dependency (composition) 
    Person owner;

    //CONSTRUCTOR
    Car (String carColor, String carName, Person ownerName) {
        this.color = carColor;
        this.name = carName;
        this.owner = ownerName;
    }

    void showOwner () {
        System.out.println("This "+ this.color +" "+ this.name +" belongs to "+ owner.name);
    }
}
    
    

