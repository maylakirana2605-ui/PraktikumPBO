package Jobsheet4.id.ac.polinema.relasiclass.tugas;

public class SistemPembayaran {
    private String metode;

    public SistemPembayaran(String metode) {
        this.metode = metode;
    }

    public void prosesBayar(double tagihan) {
        System.out.println("Pembayaran sebesar Rp" + tagihan + " menggunakan metode " + metode + " berhasil diproses.");
    }
}