import Transportasi.Mobil;
import Transportasi.Bicycle;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2020;
        mobilku.hidupkanMobil();
        mobilku.ubahGigi(3);
        System.out.println("Mobilku warnanya " + mobilku.warna + " keluaran tahun " + mobilku.tahunProduksi);
        System.out.print("Bunyinya ");
        mobilku.suara();
        System.out.print("Dan sekarang gigi mobil menunjuk ke angka " + mobilku.gigi); 

        Bicycle maBicycle = new Bicycle();
        System.out.println("\n\nColor of my bicycle is " + maBicycle.theColor);
        System.out.print("The bell sound is ");
        maBicycle.suara();
    }
}
