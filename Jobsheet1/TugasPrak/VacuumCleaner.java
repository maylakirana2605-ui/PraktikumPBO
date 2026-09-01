package Jobsheet1.TugasPrak;

public class VacuumCleaner {
    private String brand;
    private int suctionPower;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void changeSuctionPower(int power) {
        this.suctionPower = power;
    }

    public void printInfo() {
        System.out.println("Brand Vacuum Cleaner: " + brand);
        System.out.println("Daya Hisap: " + suctionPower + " Pa");
    }
}