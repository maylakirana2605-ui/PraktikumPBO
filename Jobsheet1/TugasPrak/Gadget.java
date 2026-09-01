package Jobsheet1.TugasPrak;

public class Gadget {
    private String brand;
    private int batteryCapacity;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBatteryCapacity(int capacity) {
        this.batteryCapacity = capacity;
    }

    public void printInfo() {
        System.out.println("Brand Gadget: " + brand);
        System.out.println("Kapasitas Baterai: " + batteryCapacity + " mAh");
    }
}
