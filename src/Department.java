import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

public class Department {


    String name;
    Employee head;

    public Department(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHead(Employee head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head=" + head.getName() +
                '}';
    }
}
