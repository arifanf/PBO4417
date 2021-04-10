package Transportasi;

public class Mobil {
    public String warna;
    public int tahunProduksi;
    public boolean hidup = false;
    public int gigi = 0;

    public void hidupkanMobil() {
        hidup = true;
        System.out.println("\nmesin mobil hidup");
    }

    public void matikanMobil() {
        hidup = false;
        System.out.println("\nmesin mobil mati");
    }

    public void ubahGigi(int newGigi) {
        gigi += newGigi;
    }

    public void suara() {
        System.out.println("Broom..broom");
    }
}
