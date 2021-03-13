class Matematika {
    int a;
    int b;

    int pertambahan() {
        return a + b;
    }

    int pengurangan() {
        return a - b;
    }

    int perkalian() {
        return a * b;
    }

    int pembagian() {
        return a / b;
    }
}

public class matematikaDemo {
    public static void main(String[] args) {
        //Object tambah
        Matematika tambah = new Matematika();
        //memanggil atribut dan memberi nilai
        tambah.a = 20;
        tambah.b = 20;
        System.out.println("\nHasil dari  " + tambah.a + " + " + tambah.b + " = " + tambah.pertambahan());

        //Object kurang
        Matematika kurang = new Matematika();
        //memanggil atribut dan memberi nilai
        kurang.a = 10;
        kurang.b = 5;
        System.out.println("\nHasil dari  " + kurang.a + " - " + kurang.b + " = " + kurang.pengurangan());

        //Object kali
        Matematika kali = new Matematika();
        //memanggil atribut dan memberi nilai
        kali.a = 10;
        kali.b = 20;
        System.out.println("\nHasil dari  " + kali.a + " x " + kali.b + " = " + kali.perkalian());

        //Object bagi
        Matematika bagi = new Matematika();
        //memanggil atribut dan memberi nilai
        bagi.a = 20;
        bagi.b = 2;
        System.out.println("\nHasil dari  " + bagi.a + " / " + bagi.b + " = " + bagi.pembagian());
    }
}
