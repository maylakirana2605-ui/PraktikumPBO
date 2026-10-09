package Jobsheet7.percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Perkalian p = new Perkalian();

        System.out.println("kali(25, 43)        = " + p.kali(25, 43));
        System.out.println("kali(34, 23, 56)    = " + p.kali(34, 23, 56));
        System.out.println("kali(25.5, 4.0)     = " + p.kali(25.5, 4.0));

        p.tampilkan(1, "Perkalian");
        p.tampilkan("Perkalian", 1);
    }
}