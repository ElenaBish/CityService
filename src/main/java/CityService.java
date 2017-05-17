import java.util.*;

/**
 * Created by elena on 11.05.2017.
 */
public class CityService {
    private List<City>  town = new ArrayList<City>();

    public static void main(String[] args) {



        streetSet.add(new Street(10, 20, "Lenina"));
        streetSet.add(new Street(5, 15, "Mira"));

        for (Street street : streetSet) {
            System.out.println("SreetName-"+street+", Area-"+street.calcVal());
        }

        Set<Park> parkSet = new HashSet<Park>();
        parkSet.add(new Park(20, 30, "Pobeda"));
        parkSet.add(new Park(45, 50, "GreenPark"));

        for (Park park:parkSet){
            System.out.println(park+",Area-"+park.calcVal());
        }
    }
}
