/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek;

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
        System.out.print("Bunyi belnya : ");
        vehicle2.ringBell();
        
        MotorVehicle vehicle3 = new MotorVehicle();
        vehicle3.speed = 25.7;
        vehicle3.color = "hitam";
        System.out.println("\nMotor itu berkecepatan " + vehicle3.speed + " km/jam dan berwarna " + vehicle3.color);

        vehicle3.sizeofEngine = 150;
        System.out.println("Ukuran mesinnya     : " + vehicle3.getSizeofEngine() + " cc");
        System.out.println("Memiliki nomor plat : " + vehicle3.getLicencePlate());
        vehicle3.licencePlate = "H 4411 YU";
        System.out.println("Memiliki nomor plat : " + vehicle3.getLicencePlate());
        
        MotorCycle vehicle4 = new MotorCycle();
        vehicle4.sizeofEngine = 110;
        System.out.println("\nUkuran mesinnya  : " + vehicle4.getSizeofEngine() + " cc");
        vehicle4.setGearFoot(4);
        System.out.println("Giginya saat ini : " + vehicle4.getGearFoot());
        
        Car vehicle5 = new Car();
        vehicle5.sizeofEngine = 1500;
        System.out.println("\nUkuran mesinnya  : " + vehicle5.getSizeofEngine() + " cc");
        vehicle5.setSeatBelt(true);
        System.out.println("Sudahkah memakai seatbelt ? " + vehicle5.getSeatBelt());
        
        KendaraanMelaju(vehicle2);
        KendaraanMelaju(new MotorVehicle());
        KendaraanMelaju(vehicle3);
    }
    
    public static void KendaraanMelaju(Vehicle obj) {
        obj.goStraight();
    }
}
