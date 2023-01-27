public class Pet {

    //ATTRIBUTES
    int age;
    String name;
    //lalagyan ng dependency (composition) 
    Person owner;

    //CONSTRUCTOR
    Pet (String petName, int petAge, Person ownerName) {
        this.age = petAge;
        this.name = petName;
        this.owner = ownerName;
    }

    void showOwner () {
        System.out.println("My name is "+ this.name +", my owner name is "+ owner.name);
    }
    
}
