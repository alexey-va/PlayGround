import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
public class Person {

    Name name;
    int height;
    Person father;

    public Person(@NonNull Name name, int height, Person father){
        this.name = name;
        this.height=height;
        this.father=father;

        parseFather();
    }

    public Person(@NonNull Name name, int height){
        this.name=name;
        this.height=height;
    }

    public void parseFather(){
        if(this.father != null && this.father.name != null &&
                this.name.n1 == null && this.father.name.n1 != null)
            this.name.n1 = this.father.name.n1;
        if(this.father != null && this.father.name != null &&
                this.name.n3 == null && this.father.name.n2 != null)
            this.name.n3 = this.father.name.n2+"ович";
    }

    @Override
    public String toString() {
        return name + ", рост: " + height;
    }
}
