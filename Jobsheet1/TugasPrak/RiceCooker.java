package Jobsheet1.TugasPrak;

public class RiceCooker {
    private String brand;
    private double capacityLiter;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(double capacity) {
        this.capacityLiter = capacity;
    }

    public void printInfo() {
        System.out.println("Brand Rice Cooker: " + brand);
        System.out.println("Kapasitas: " + capacityLiter + " Liter");
    }
}
