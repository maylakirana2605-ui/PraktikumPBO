package Jobsheet4.id.ac.polinema.relasiclass.tugas;

public class Tamu {
    private String nik;
    private String nama;

    public Tamu(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public void bayarKamar(SistemPembayaran gateway, double nominal) {
        System.out.println("Tamu " + nama + " melakukan transaksi pembayaran...");
        gateway.prosesBayar(nominal);
    }

    public String info() {
        return "NIK: " + nik + ", Nama: " + nama;
    }
}