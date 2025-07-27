package InterfacePolymorphism;

public class Motorcycle implements Action {
    @Override
    public void speedUp() {
        System.out.println("Motor Çalıştı");
    }

    @Override
    public void slowDown() {
        System.out.println("Motor Yavaşladı");
    }

    @Override
    public void stop() {
        System.out.println("Motor Durdu");
    }
}