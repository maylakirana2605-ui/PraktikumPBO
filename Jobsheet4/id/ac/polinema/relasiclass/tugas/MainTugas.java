package Jobsheet4.id.ac.polinema.relasiclass.tugas;

public class MainTugas {
    public static void main(String[] args) {
        Kamar kamar101 = new Kamar("101", "King Bed", true);
        Tamu tamu1 = new Tamu("3573012345670001", "Budi Santoso");

        kamar101.setTamu(tamu1);
        kamar101.infoKamar();

        SistemPembayaran transfer = new SistemPembayaran("QRIS");
        tamu1.bayarKamar(transfer, 750000);
    }
}