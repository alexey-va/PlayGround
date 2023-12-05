import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
public class City {

    String name;
    Set<Route> routeList = new HashSet<>();
    private record Route(City target, int price){}

    public City(String name){
        this.name=name;
    }

    public void addRoute(City target, int price, boolean bidirectional){
        routeList.add(new Route(target, price));
        if(bidirectional) target.addRoute(this, price, false);
    }

    @Override
    public String toString(){
        return  name+ ". "+
                "Routes:\n"+
                routeList.stream()
                        .map(route -> " > To "+ route.target.name+" for "+route.price+"$")
                        .collect(Collectors.joining("\n"));
    }




}
