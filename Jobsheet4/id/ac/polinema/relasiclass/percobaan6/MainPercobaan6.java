package Jobsheet4.id.ac.polinema.relasiclass.percobaan6;

public class MainPercobaan6 {
    public static void main(String[] args) {
        Printer printer = new Printer("Epson L3110");
        Laptop laptop = new Laptop("Thinkpad", printer);

        laptop.cetakDokumen("Laporan.pdf");
    }
}