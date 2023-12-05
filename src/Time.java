import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Builder
@AllArgsConstructor
public class Time {

    LocalTime time;

    public Time(int sec){
        time = LocalTime.ofSecondOfDay(sec % (LocalTime.MAX.toSecondOfDay()+1));
    }

    @Override
    public String toString(){
        return time.format(
                DateTimeFormatter.ISO_LOCAL_TIME
        );
    }

}
