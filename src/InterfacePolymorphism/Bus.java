package InterfacePolymorphism;

public class Bus implements Action {
    @Override
    public void speedUp() {
        System.out.println("Otobüs Çalıştı");
    }
    @Override
    public void slowDown() {
        System.out.println("Otobüs Yavaşladı");
    }

    @Override
    public void stop() {
        System.out.println("Otobüs Durdu");
    }
}
