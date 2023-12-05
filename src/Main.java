import java.time.LocalTime;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Person p1 = new Person("Клеопатра", 152);
        //Person p2 = new Person("Пушкин", 167);
        //Person p3 = new Person("Владимир", 189);

        //System.out.println("1.2");
        //Stream.of(p1,p2,p3).forEach(System.out::println);

        Name n1 = new Name.NameBuilder()
                .n1("Клеопатра")
                .build();
        Name n2 = new Name.NameBuilder()
                .n1("Пушкин")
                .n2("Александр")
                .n3("Сергеевич")
                .build();
        Name n3 = new Name.NameBuilder()
                .n1("Маяковский")
                .n2("Владимир")
                .build();


        System.out.println("\n1.3");
        Stream.of(n1,n2,n3).forEach(System.out::println);

        System.out.println("\n1.4");
        Time time1 = new Time(12000);
        Time time2 = new Time(91800);
        Time time3 = new Time(86400);
        Stream.of(time1, time2, time3).forEach(System.out::println);


        System.out.println("\n1.5");
        Stream.of(new Building(1), new Building(5), new Building(23))
                .forEach(System.out::println);

        System.out.println("\n2.1");
        Line l1 = new Line(new Point(1,3), new Point(23,8));
        Line l2 = new Line(new Point(5,10), new Point(25,10));
        Line l3 = new Line(l1.getStart(), l2.getEnd());


        l1.getEnd().x+=135;
        l2.getEnd().x-=351;

        Stream.of(l1, l2, l3).forEach(System.out::println);

        System.out.println("\n2.2");
        Stream.of(new Person(n1, 152), new Person(n2, 167), new Person(n3, 189))
                .forEach(System.out::println);

    }
}