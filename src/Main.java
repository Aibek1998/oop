public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.name = "Burenka";
        cow.age = 6 ;
        cow.color = "white";
        cow.breed = "Russians breed";
        cow.weight = 120;
        System.out.println(cow.name);
        System.out.println(cow.age);
        System.out.println(cow.color);
        System.out.println(cow.breed);
        System.out.println(cow.weight);
    }
}