public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        System.out.println("full name = " + person.getFullName());
        person.setFirstName("Romualdo");
        person.setLastName("França");
        System.out.println("full name = " + person.getFullName());
        person.setAge(13);
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("Romualdo");
        person.setLastName("");
        System.out.println("full name = " + person.getFullName());
        person.setFirstName("");
        person.setLastName("França");
        System.out.println("full name = " + person.getFullName());
    }
}