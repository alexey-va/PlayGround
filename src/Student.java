import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Student {

    String name;
    int[] grades;

    public Student(String name, int... grades){
        this.name = name;
        this.grades=grades;
    }

}
