public class App {
    public static void main(String[] args) throws Exception {

        // PERSON OBJECT
        Person Me = new Person("Katherine", 18);
        Person Friend = new Person ("Lee Jae Wook", 24);

        Me.addFriend(Friend);

        //PET OBJECT
        //Composition
        //hindi pwede mag exist ng wala yung isa, kaya may dependency
        //kailangan may owner bago ka makagawa ng pet
        Pet Dog = new Pet ("Eggy", 1, Me);
        Dog.showOwner();

        Person Classmate1 = new Person("Maycee", 18);
        Person Classmate2 = new Person("Aaliyah" , 18);
        Person Classmate3 = new Person ("Elijan", 20);

        Me.addClassmate(Classmate1);
        Me.addClassmate(Classmate2);
        Me.addClassmate(Classmate3);

        //CAR OBJECT
       Car jeepCar1 = new Car("Black", "SUV", Me);
       jeepCar1.showOwner();
       Car jeepCar2 = new Car("White", "Crossover", Me);
       jeepCar2.showOwner();

    }
}
