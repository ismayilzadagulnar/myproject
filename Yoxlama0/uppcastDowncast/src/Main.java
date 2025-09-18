public class Main {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound(); //polimorfizm

        if (a1 instanceof Dog) {
            ((Dog) a1).fetch();
        }
        if (a2 instanceof Cat) {
            ((Cat) a2).scratch();
        }
        if (a1 instanceof Cat) {
            ((Cat) a1).scratch(); //sehv downcasting
        }
        else {
            System.out.println("a1 is not instance of Cat");
        }

        a1.displayKingdom();
        a2.displayKingdom();
    }
}
