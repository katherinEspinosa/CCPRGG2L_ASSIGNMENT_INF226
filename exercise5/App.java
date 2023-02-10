public class App {
    public static void main(String[] args) throws Exception {

        Person myself = new Person();
        System.out.println(myself.getName());

        myself.setName("Maegan");
        System.out.println(myself.getName());

        Daughter me = new Daughter();

        System.out.println(me.surname);
        me.showSurname();
    }
}

