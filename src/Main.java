public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.name = "Burenka";
        cow.age = 6;
        cow.color = "white";
        cow.breed = "Russians breed";
        cow.weight = 120;
        System.out.println(cow.name);
        System.out.println(cow.age);
        System.out.println(cow.color);
        System.out.println(cow.breed);
        System.out.println(cow.weight);
        Cow cow1 = new Cow();
        cow1.name = "Marta";
        cow1.age = 1;
        cow1.color = "yellow";
        cow1.breed = "Holland breed";
        cow1.weight = 60;
        System.out.println();
        System.out.println(cow1.name);
        System.out.println(cow1.age);
        System.out.println(cow1.color);
        System.out.println(cow1.breed);
        System.out.println(cow1.weight);
        Cow cow2 = new Cow();
        cow2.name = "Maria";
        cow2.age = 2;
        cow2.color = "black";
        cow2.breed = "Ukrain breed";
        cow2.weight = 80;
        System.out.println();
        System.out.println(cow2.name);
        System.out.println(cow2.age);
        System.out.println(cow2.color);
        System.out.println(cow2.breed);
        System.out.println(cow2.weight);
        System.out.println();
        System.out.println("    CAR    ");
        System.out.println();
        Car car = new Car();
        car.name = "BMW";
        car.marka = "i8";
        car.color = "white";
        car.year = 2022;
        car.speed = 360;
        System.out.println("NAME : "+car.name + "-"+car.marka);
        System.out.println("year : "+car.year);
        System.out.println("color : "+car.color);
        System.out.println("speed : "+car.speed);



    }
}