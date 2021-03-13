class Sepeda {
    String warna;
    String merek;
    int tahun;
    int roda;
    int kecepatan = 0;
    int gerigi = 0;
    
    public void setGerigi(int newGerigi) {
        gerigi = gerigi + newGerigi;
    }

    public void setKecepatan(int newKecepatan) {
        kecepatan += newKecepatan;
    }
}

public class sepedaDemo {
    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda();
        // memanggil atribut dan memberi nilai
        sepedaku.merek = "Wimcycle";
        sepedaku.warna = "Merah";
        sepedaku.tahun = 2019;
        sepedaku.roda = 2;
        sepedaku.setGerigi(3);
        sepedaku.setKecepatan(11);
        //mencetak
        System.out.println("------- Sepedaku -------");
        System.out.println("Merek     : " + sepedaku.merek);
        System.out.println("Warna     : " + sepedaku.warna);
        System.out.println("Tahun     : " + sepedaku.tahun);
        System.out.println("Roda      : " + sepedaku.roda);
        System.out.println("Gerigi    : " + sepedaku.gerigi);
        System.out.println("Kecepatan : " + sepedaku.kecepatan);
    }
}
