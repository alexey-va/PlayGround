import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.*;
import java.util.stream.Collectors;

public class Department {


    String name;
    Employee head;
    Set<Employee> employeeList = new HashSet<>();

    public Department(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee... employee){
        Arrays.stream(employee).forEach(e ->{
            e.setDepartment(this);
            employeeList.add(e);
        });
    }

    public void setHead(Employee head) {
        addEmployee(head);
        this.head = head;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head=" + head.getName() +
                ", members="+employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(",","[","]")) +
                '}';
    }
}
