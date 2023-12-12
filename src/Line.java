import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Line {

    Point start, end;

    public Line(double x1, double y1, double x2, double y2){
        start = new Point(x1,y1);
        end = new Point(x2,y2);
    }

    public double length(){
        return start.distanceTo(end);
    }

    @Override
    public String toString(){
        return "Line from "+start+" to "+end;
    }
}
