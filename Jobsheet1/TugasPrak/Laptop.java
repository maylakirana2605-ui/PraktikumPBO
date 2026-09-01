package Jobsheet1.TugasPrak;

public class Laptop extends Gadget {
    private int ramSizeGb;
    private String processorName;

    public void setRam(int ram) {
        this.ramSizeGb = ram;
    }

    public void setProcessor(String processor) {
        this.processorName = processor;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Ukuran RAM: " + ramSizeGb + " GB");
        System.out.println("Prosesor: " + processorName);
    }
}
