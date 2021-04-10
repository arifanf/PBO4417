package Transportasi;

public class Bicycle {
    public int speed = 0;
    public String theColor = "blue";

    public void suara() {
        System.out.println("Kring..kring..");
    }
    public void tambahSpeed(int increment) {
        speed += increment;
        System.out.println("kecepatannya " + speed);
    }
}
