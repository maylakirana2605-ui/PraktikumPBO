package Jobsheet1.TugasPrak;

public class Smartphone extends Gadget {
    private int cameraResolution;
    private String simType;

    public void setCameraResolution(int mp) {
        this.cameraResolution = mp;
    }

    public void setSimType(String simType) {
        this.simType = simType;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Resolusi Kamera: " + cameraResolution + " MP");
        System.out.println("Tipe SIM: " + simType);
    }
}