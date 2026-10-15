package Jobsheet7.tugas1;

public class Segitiga {
    private double sudut;

    public double sisaSudut(double sudutA) {
        if (sudutA <= 0 || sudutA >= 180) {
            throw new IllegalArgumentException(
                    "Sudut harus lebih dari 0 dan kurang dari 180");
        }

        sudut = 180 - sudutA;
        return sudut;
    }

    public double sisaSudut(double sudutA, double sudutB) {
        if (sudutA <= 0 || sudutA >= 180 ||
            sudutB <= 0 || sudutB >= 180 ||
            sudutA + sudutB >= 180) {
            throw new IllegalArgumentException("Sudut tidak valid");
        }

        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public double getSudut() {
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return sisiA + sisiB + Math.sqrt(
                sisiA * sisiA + sisiB * sisiB);
    }
}