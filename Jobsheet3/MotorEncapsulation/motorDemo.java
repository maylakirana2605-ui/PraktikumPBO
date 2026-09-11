package Jobsheet3.MotorEncapsulation;

public class motorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.nyalakanMesin();

        for (int i = 0; i < 22; i++) {
            motor.tambahKecepatan();
            motor.printStatus();
        }

        motor.matikanMesin();
        motor.printStatus();
    }
}