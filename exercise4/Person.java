public class Person {

    //ATTRIBUTES
    String name;
    int age; 

    //CONSTRUCTORS
    Person (String personName, int personAge) {
        this.name = personName;
        this.age = personAge;
    }

    //aggregation 
    //tumatanggap siya ng object na nasa Person class which is yung Me and Friend 
    void addFriend (Person friend) {
        System.out.println(this.name +" is friends with "+ friend.name);
        //kailangan mo ilagay yung attribute para hindi lumabas sa output na "Katherine is friends with person1234etc" kineme
        //hindi "friend" lang pero "friend.name" dapat. Hindi object lang ang nakalagay kundi dapat pati attribute. 
        
    }

    void addClassmate (Person classmate) {
        System.out.println( this.name +" is classmates with "+ classmate.name);
    }
}
