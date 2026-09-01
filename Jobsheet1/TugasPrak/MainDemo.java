package Jobsheet1.TugasPrak;

public class MainDemo {
    public static void main(String[] args) {
        VacuumCleaner vacuum = new VacuumCleaner();
        vacuum.setBrand("Dyson");
        vacuum.changeSuctionPower(15000);
        vacuum.printInfo();
        System.out.println();

        RiceCooker cooker = new RiceCooker();
        cooker.setBrand("Philips");
        cooker.setCapacity(1.8);
        cooker.printInfo();
        System.out.println();

        Fan fan = new Fan();
        fan.setBrand("Miyako");
        fan.changeSpeed(3);
        fan.printInfo();
        System.out.println();

        Smartphone hp = new Smartphone();
        hp.setBrand("Samsung");
        hp.setBatteryCapacity(5000);
        hp.setCameraResolution(50);
        hp.setSimType("Dual SIM / eSIM");
        hp.printInfo();
        System.out.println();

        Laptop laptop = new Laptop();
        laptop.setBrand("ASUS");
        laptop.setBatteryCapacity(4500);
        laptop.setRam(16);
        laptop.setProcessor("Intel Core i5");
        laptop.printInfo();
    }
}