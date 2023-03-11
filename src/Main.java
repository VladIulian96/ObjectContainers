import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Person> personTreeSet = new TreeSet<>(new AgeComparator());
        Map<Person, List<Hobby>> personHobbyHashMap = new HashMap<>();


        Person iulian = new Person("Iulian", 19);
        Person razvan = new Person("Razvan", 25);
        Person stoian = new Person("Stoian", 20);

        personTreeSet.add(iulian);
        personTreeSet.add(razvan);
        personTreeSet.add(stoian);

        for(Person person : personTreeSet) {
            System.out.println("Name:" + person.name + " Age:" + person.age);
        }

        List<Adress> iulianHobbyAdressList = new ArrayList<>();
        Adress iulianHobbyAdress = new Adress("Home");
        iulianHobbyAdressList.add(iulianHobbyAdress);

        List<Hobby> iulianHobbyList = new ArrayList<>();
        Country romania = new Country("Romania");
        Hobby gaming = new Hobby("Gaming", 1, iulianHobbyAdressList, romania);
        iulianHobbyList.add(gaming);

        personHobbyHashMap.put(iulian, iulianHobbyList);

        for(Hobby hobby : iulianHobbyList) {
            System.out.println("Hobby:" + hobby.name + " Adresses:" + hobby.getAdresses() + "Country:" + hobby.country);
        }

    }


}