package Jobsheet7.percobaan4;

public class Ikan {
    public void swim() {
        System.out.println("Ikan bisa berenang");
    }

    public Ikan beranak() {
        return new Ikan();
    }
}