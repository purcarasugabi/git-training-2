import model.Person;

public class Main {

    public static void main(String[] args){

        System.out.print("Hello world");

        Person person = new Person("Bob","Somehow");

        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());
    }
}
