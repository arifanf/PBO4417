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
public class Dosen extends Akademik {
    private int noId;
    private String nidn;
    private String nama;
    private String jenisKelamin;
    private String role;
//    String text="Masukkan ";

    @Override
    public void setData() {
        System.out.println("");
        System.out.println("");
        System.out.println("Input Data Dosen");
        System.out.print("Masukkan NIDN \t\t: ");
        this.nidn = str.nextLine();
        System.out.print("Masukkan Nama \t\t: ");
        this.nama = str.nextLine();
        System.out.print("Masukkan Jenis Kelamin : ");
        this.jenisKelamin = str.nextLine();
        this.role = "Dosen";
    }

    @Override
    public void show() {
        System.out.println("ID \t\t: " + this.noId);
        System.out.println("NIM \t\t: " + this.nidn);
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
        this.noId = 121600;
    }

    @Override
    public void setNoId(int noId) {
        this.noId = noId + 1;
    }
}
