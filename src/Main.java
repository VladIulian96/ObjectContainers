import java.util.*;

public class Main {


    public static void main(String[] args) {

        Set<Person> personSet = new TreeSet<>(new AgeComparator());

        Person iulian = new Person("Iulian", 19);
        Person razvan = new Person("Razvan", 25);
        Person stoian = new Person("Stoian", 20);

        personSet.add(iulian);
        personSet.add(razvan);
        personSet.add(stoian);

        for(Person person : personSet) {
            System.out.println("Name:" + person.name + " Age:" + person.age);
        }

    }

}