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
    public Time(int h, int m, int s){
        if(h > LocalTime.MAX.getHour() || m > LocalTime.MAX.getMinute() || s > LocalTime.MAX.getSecond())
            throw new IllegalArgumentException("Incorrent time values! "+h+" | "+m+" | "+s);
        time = LocalTime.of(h,m,s);
    }

    public int hours(){
        return time.getHour();
    }

    public int minutes(){
        return time.getMinute();
    }

    public int seconds(){
        return time.getSecond();
    }

    @Override
    public String toString(){
        return time.format(
                DateTimeFormatter.ISO_LOCAL_TIME
        );
    }

}
