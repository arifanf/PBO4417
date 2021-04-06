/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ASUS
 */
public class UjiKendaraan {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        System.out.println("Kendaraan itu berkecepatan " + vehicle1.speed + " km/jam dan berwarna " + vehicle1.color);
        vehicle1.goStraight();
        vehicle1.turnLeft();
        vehicle1.turnRight();

        Bicycle vehicle2 = new Bicycle();
        vehicle2.speed = 2.5;
        vehicle2.color = "hijau";
        System.out.println("\nSepeda itu berkecepatan " + vehicle2.speed + " km/jam dan berwarna " + vehicle2.color);
        vehicle2.goStraight();
        vehicle2.turnLeft();
        vehicle2.turnRight();
        System.out.print("Bunyi belnya : ");
        vehicle2.ringBell();
        
        MotorVehicle vehicle3 = new MotorVehicle();
        vehicle3.speed = 25.7;
        vehicle3.color = "hitam";
        System.out.println("\nMotor itu berkecepatan " + vehicle3.speed + " km/jam dan berwarna " + vehicle3.color);
        vehicle3.goStraight();
        vehicle3.turnLeft();
        vehicle3.turnRight();
        vehicle3.sizeofEngine = 1500;
        System.out.println("Ukuran mesinnya     : " + vehicle3.getSizeofEngine() + " cc");
        System.out.println("Memiliki nomor plat : " + vehicle3.getLicencePlate());
        vehicle3.licencePlate = "H 4411 YU";
        System.out.println("Memiliki nomor plat : " + vehicle3.getLicencePlate());
    }
}
