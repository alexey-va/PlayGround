import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    String name;
    Department department;


    @Override
    public String toString() {
        if (department.head == this)
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", boss of department=" + department.name +
                    '}';
        else return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department.name +
                ", boss=" + department.head.name +
                '}';
    }
}
