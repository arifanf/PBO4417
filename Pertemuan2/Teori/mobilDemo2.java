class Mobil2 {
    String warna;
    int tahunProduksi;
    boolean hidup = false;
    int gigi = 0;

    public void hidupkanMobil() {
        hidup = true;
        System.out.println("\nmesin hidup");
    }

    public void matikanMobil() {
        hidup = false;
        System.out.println("\nmesin mati");
    }

    public void ubahGigi(int newGigi) {
        gigi = gigi + newGigi;
    }
}
public class mobilDemo2 {
    public static void main(String[] args) {
        // Membuat object
        Mobil2 mobilku = new Mobil2();

        // Memanggil atribut dan memberi nilai
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        mobilku.hidupkanMobil();
        mobilku.ubahGigi(2);
        System.out.println("Warna : " + mobilku.warna);
        System.out.println("Tahun : " + mobilku.tahunProduksi);
        System.out.println("Gigi mobil sekarang: " + mobilku.gigi);
    }
}