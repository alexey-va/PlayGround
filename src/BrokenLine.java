import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class BrokenLine {

    Point[] points;

    @Override
    public String toString(){
        return Arrays.stream(points)
                        .map(Point::toString)
                        .collect(Collectors.joining(",","Line [", "]"));
    }
}
