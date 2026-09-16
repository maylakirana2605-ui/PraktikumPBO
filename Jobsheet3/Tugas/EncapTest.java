package Jobsheet3.Tugas;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");

        encap.setAge(35);
        System.out.println("Name: " + encap.getName());
        System.out.println("Age (input 35): " + encap.getAge());

        encap.setAge(15);
        System.out.println("Age (input 15): " + encap.getAge());

        encap.setAge(24);
        System.out.println("Age (input 24): " + encap.getAge());
    }
}