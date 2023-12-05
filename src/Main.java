import java.time.LocalTime;
import java.util.Arrays;
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

        //System.out.println("\n2.2");
        //Stream.of(new Person(n1, 152), new Person(n2, 167), new Person(n3, 189))
        //        .forEach(System.out::println);

        System.out.println("\n2.3");
        Person p1 = new Person(
                Name.builder().n1("Чудов").n2("Иван").build(),
                10);
        Person p2 = new Person(
                Name.builder().n1("Чудов").n2("Петр").build(),
                -132
        );
        Person p3 = new Person(
                Name.builder().n2("Борис").build(),
                13123
        );

        p2.setFather(p1);
        p2.parseFather();

        p3.setFather(p2);
        p3.parseFather();

        Stream.of(p1, p2, p3).forEach(System.out::println);

        System.out.println("\n2.4");
        Department department = new Department("IT");
        Employee e1 = new Employee("Петров", department);
        Employee e2 = new Employee("Козлов", department);
        Employee e3 = new Employee("Сидоров", department);
        department.setHead(e2);
        Stream.of(e1,e2,e3,department).forEach(System.out::println);


        System.out.println("\n3.1");
        Student vasya = new Student("Vasya", new int[]{3,4,5});
        Student petya = new Student("Petya", vasya.getGrades());
        petya.grades[0]=5;
        Stream.of(vasya, petya).forEach(System.out::println);

        petya.grades[0]=3;
        System.out.println();

        petya.grades= vasya.getGrades().clone();
        petya.grades[0]=5;
        Stream.of(vasya, petya).forEach(System.out::println);

        System.out.println("\n3.2");
        BrokenLine line = new BrokenLine(new Point[]{
                new Point(1,5),
                new Point(2,8),
                new Point(5,3)
        });
        BrokenLine line2 = new BrokenLine(new Point[]{
                line.points[0],
                new Point(2,-5),
                new Point(4,-8),
                line.points[line.points.length-1]
        });

        line.points[0].x = 123;

        Stream.of(line, line2).forEach(System.out::println);

        System.out.println("\n3.3");
        City ca = new City("A");
        City cb = new City("B");
        City cc = new City("C");
        City cd = new City("D");
        City ce = new City("E");
        City cf = new City("F");

        ca.addRoute(cd, 6, true);
        ca.addRoute(cf, 1, false);
        ca.addRoute(cb, 5,true);

        cf.addRoute(cb, 1, false);

        cc.addRoute(cd, 4, true);
        cc.addRoute(cb, 3, true);

        ce.addRoute(cf, 2, true);
        cd.addRoute(ce, 2, false);

        Stream.of(ca,cb,cc,cd,ce,cf).forEach(System.out::println);

        System.out.println("\n3.4");

    }
}