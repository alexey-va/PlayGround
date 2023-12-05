import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Building {

    final int floors;


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("дом с "+floors);
        // вроде так но я не оч помню
        if(floors % 10 == 1 && floors != 11) return builder.append(" этажем").toString();
        return builder.append(" этажами").toString();
    }
}
