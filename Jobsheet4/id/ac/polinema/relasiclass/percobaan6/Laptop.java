package Jobsheet4.id.ac.polinema.relasiclass.percobaan6;

public class Laptop {
    private String merk;
    private Printer printerDefault;

    public Laptop(String merk) {
        this.merk = merk;
    }

    public Laptop(String merk, Printer printerDefault) {
        this.merk = merk;
        this.printerDefault = printerDefault;
    }

    public void setPrinterDefault(Printer printerDefault) {
        this.printerDefault = printerDefault;
    }

    public Printer getPrinterDefault() {
        return printerDefault;
    }

    public void cetakDokumen(String namaFile) {
        if (printerDefault != null) {
            System.out.println(merk + " mengirim dokumen ke printer...");
            printerDefault.cetak(namaFile);
        } else {
            System.out.println("Gagal mencetak: Tidak ada printer default yang terhubung!");
        }
    }
}