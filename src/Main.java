import java.time.LocalTime;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Gun gun = new Gun(3);
        for(int i=0;i<5;i++) gun.shoot();

        Cat cat = new Cat("asd");
        cat.meow(10);
        cat.meow();

        Line line = new Line(0,0,3,4);
        System.out.println(line.length());

        System.out.println(new Time(34056).hours());
        System.out.println(new Time(4532).minutes());
        System.out.println(new Time(123).seconds());

        Fraction fraction = new Fraction(1,3);
        System.out.println(fraction.mul(new Fraction(2,3)));
        System.out.println();

        Student vasya = new Student("vasya", 3,4,5,4);
        Student petya = new Student("petya", 5,5,5,5);
        System.out.println(vasya.average()+" "+vasya.isCool());
        System.out.println(petya.average()+" "+petya.isCool());

        BrokenLine brokenLine = new BrokenLine(new Point(1,5), new Point(2,8), new Point(5,3));
        System.out.println(brokenLine.length());
        brokenLine.add(new Point(5,15), new Point(8,10));
        System.out.println(brokenLine.length());

        System.out.println("\nsquare");
        Square square = new Square(5,3, 23);
        BrokenLine brokenLine1 = square.toLine();
        System.out.println(brokenLine1.length());
        brokenLine1.points.get(brokenLine1.points.size()-1).x=15;
        brokenLine1.points.get(brokenLine1.points.size()-1).y=25;
        System.out.println(brokenLine1.length());

    }



}