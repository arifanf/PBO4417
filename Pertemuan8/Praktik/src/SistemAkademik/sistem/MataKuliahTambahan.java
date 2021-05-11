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
public class MataKuliahTambahan extends Akademik {
    private int noId;
    private int semester;
    private String nama;

    @Override
    public void setData() {
        System.out.println("");
        System.out.println("");
        System.out.println("Input Mata Kuliah");
        System.out.print("Masukkan Nama Mata kuliah : ");
        this.nama = str.nextLine();
        System.out.print("Masukkan Semester Anda \t: ");
        this.semester = str.nextInt();

    }

    @Override
    public void show() {
        System.out.println("Nomor ID \t: " + this.noId);
        System.out.println("NIM \t\t: " + this.nama);
        System.out.println("Nama \t\t: " + this.semester);
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
