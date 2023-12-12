import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Data
public class Student {

    String name;
    List<Integer> grades;

    public Student(String name, int... grades){
        this.name = name;
        this.grades= IntStream.of(grades).boxed().collect(Collectors.toList());
    }

    public double average(){
        return grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    public boolean isCool(){
        if(grades.isEmpty()) return false;
        return grades.stream().allMatch(i -> i==5);
    }

}
