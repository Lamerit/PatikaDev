package InterfacePolymorphism;

public class Car implements Action {
    @Override
    public void speedUp() {
        System.out.println("Araba Çalıştı");
    }
    @Override
    public void slowDown() {
        System.out.println("Araba Yavaşladı");
    }
    @Override
    public void stop() {
        System.out.println("Araba Durdu");
    }
}