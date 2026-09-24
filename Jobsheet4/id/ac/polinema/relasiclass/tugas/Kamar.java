package Jobsheet4.id.ac.polinema.relasiclass.tugas;

public class Kamar {
    private String nomorKamar;
    private Fasilitas fasilitas;
    private Tamu tamu;

    public Kamar(String nomorKamar, String tipeKasur, boolean adaWifi) {
        this.nomorKamar = nomorKamar;
        this.fasilitas = new Fasilitas(tipeKasur, adaWifi);
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }

    public Tamu getTamu() {
        return tamu;
    }

    public void infoKamar() {
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Fasilitas Kamar: " + fasilitas.info());
        if (tamu != null) {
            System.out.println("Status: Terisi - " + tamu.info());
        } else {
            System.out.println("Status: Kosong");
        }
    }
}