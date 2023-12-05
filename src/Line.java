import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Line {

    Point start, end;

    @Override
    public String toString(){
        return "Line from "+start+" to "+end;
    }
}
