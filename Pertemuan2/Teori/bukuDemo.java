class Buku {
    private String Judul;
    private String Pengarang;
    private String Penerbit;
    private int Tahun;

    public Buku(String Judul, String Pengarang, String Penerbit, int Tahun) {
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
    }

    public void cetakBuku() {
        System.out.println("Judul      :  " + this.Judul);
        System.out.println("Pengarang  :  " + this.Pengarang);
        System.out.println("Penerbit   :  " + this.Penerbit);
        System.out.println("Tahun      :  " + this.Tahun);
    }
}

public class bukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        buku1.cetakBuku();
        Buku buku2 = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);
        buku2.cetakBuku();
    }
}
