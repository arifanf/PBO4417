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
public class Mahasiswa extends Akademik {
    private int noId;
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String role;
//    String text="Masukkan ";

    @Override
    public void setData() {
        System.out.println("");
        System.out.println("");
        System.out.println("Input Data Mahasiswa");
        System.out.print("Masukkan NIM \t\t: ");
        this.nim = str.nextLine();
        System.out.print("Masukkan Nama \t\t: ");
        this.nama = str.nextLine();
        System.out.print("Masukkan Jenis Kelamin \t: ");
        this.jenisKelamin = str.nextLine();
        this.role = "Mahasiswa";
    }
    
    @Override
    public void show() {
        System.out.println("ID \t\t: " + this.noId);
        System.out.println("NIM \t\t: " + this.nim);
        System.out.println("Nama \t\t: " + this.nama);
        System.out.println("Jenis Kelamin \t: " + this.jenisKelamin);
        System.out.println("Role \t\t: " + this.role);

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