/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemAkademik.sistem;

import SistemAkademik.Akademik;

/**
 *
 * @author ASUS
 */
public class NilaiMahasiswa extends Akademik {
    private int noId;
    private int nPokok;
    private int nTambahan;
    private int nAkhir;
    private String nama;

    @Override
    public void setData() {
        System.out.println("");
        System.out.println("");
        System.out.println("Input Nilai Mahasiswa");
        System.out.print("Masukan Nama \t\t\t\t: ");
        this.nama = str.nextLine();
        System.out.print("Masukan Nilai Mata Kuliah Pokok \t\t: ");
        this.nPokok = str.nextInt();
        System.out.print("Masukan Nilai Mata Kuliah Tambahan \t: ");
        this.nTambahan = str.nextInt();
        this.nAkhir = ((int)(this.nPokok * 60 / 100) + (this.nTambahan * 40 / 100));
    }

    @Override
    public void show() {
        System.out.println("Nama \t\t\t\t: " + this.nama);
        System.out.println("Nilai Mata Kuliah Pokok \t\t: " + this.nPokok);
        System.out.println("Nilai Mata Kuliah Tambahan\t: " + this.nTambahan);
        System.out.println("Nilai Akhir \t\t\t: " + this.nAkhir);
    }
    @Override
    public int getNoId() {
        return this.noId;
    }

    @Override
    public void setNoId() {
        this.noId = 12160;
    }

    @Override
    public void setNoId(int noId) {
        this.noId = noId + 1;
    }
}
