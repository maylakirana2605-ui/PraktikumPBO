package Jobsheet4.id.ac.polinema.relasiclass.tugas;

public class Fasilitas {
    private String tipeKasur;
    private boolean adaWifi;

    public Fasilitas(String tipeKasur, boolean adaWifi) {
        this.tipeKasur = tipeKasur;
        this.adaWifi = adaWifi;
    }

    public String getTipeKasur() {
        return tipeKasur;
    }

    public boolean isAdaWifi() {
        return adaWifi;
    }

    public String info() {
        return "Kasur: " + tipeKasur + ", WiFi: " + (adaWifi ? "Tersedia" : "Tidak Tersedia");
    }
}