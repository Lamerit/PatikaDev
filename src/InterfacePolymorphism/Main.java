package InterfacePolymorphism;

public class Main {
    public static void main(String[] args) {
        Action[] actions = {new Bus(), new Car(), new Motorcycle()};
        for (Action action: actions){
            action.speedUp();
            action.slowDown();
            action.stop();
            System.out.println("-----------------");
        }
    }
}