import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {

    Name name;
    int height;

    @Override
    public String toString() {
        return name + ", рост: " + height;
    }
}
