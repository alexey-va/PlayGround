import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class BrokenLine {

    Point[] points;

    public BrokenLine(Point... points){
        this.points = points;
    }

    @Override
    public String toString(){
        if(points == null || points.length == 0) return "Line with no points!";
        return Arrays.stream(points)
                        .map(Point::toString)
                        .collect(Collectors.joining(",","Line [", "]"));
    }
}
