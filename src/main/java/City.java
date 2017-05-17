import java.util.HashSet;
import java.util.Set;

/**
 * Created by elena on 11.05.2017.
 */
public class City {
    private  String nameCity;
    private Set<Street> streetSet=new HashSet<Street>();
    private Set<Park> parkSet=new HashSet<Park>();


    public City(String nameCity) {
        this.nameCity = nameCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    @Override
    public String toString() {
        return "City{" +
                "nameCity='" + nameCity + '\'' +
                '}';
    }

    public Set<Street> getStreetSet() {
        return streetSet;
    }

    public Set<Park> getParkSet() {
        return parkSet;
    }
}
