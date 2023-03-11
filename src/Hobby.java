import java.util.ArrayList;
import java.util.List;

public class Hobby {

    String name;
    int frequency;
    List<Adress> adresses = new ArrayList<>();
    String country;

    Hobby(String name, int frequency, List<Adress> adresses, Country country) {
        this.name = name;
        this.frequency = frequency;
        this.adresses = adresses;
        this.country = country.name;;
    }

    public String getAdresses() {
        String allAddresses = "";

        for(Adress adress : adresses) {
            allAddresses += adress.name + " ";
        }

        return allAddresses;
    }

}
