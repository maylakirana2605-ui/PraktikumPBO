package Jobsheet1.TugasPrak;

public class Fan {
    private String brand;
    private int speedLevel;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void changeSpeed(int speed) {
        this.speedLevel = speed;
    }

    public void printInfo() {
        System.out.println("Brand Kipas: " + brand);
        System.out.println("Kecepatan: Level " + speedLevel);
    }
}
