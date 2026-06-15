/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.naufalhafiz03;

/**
 *
 * @author User
 */
public class Mahasiswa {
    private int nim;
    private String nama;
    private String jurusan;

    // Constructor 1
    public Mahasiswa() {
    }

    // Constructor 2
    public Mahasiswa(int nim) {
        this.nim = nim;
    }

    // Constructor 3
    public Mahasiswa(int nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // Getter dan Setter
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    // Method tanpa nilai balik
    public void tampilData() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Jurusan : " + jurusan);
    }

    // Method dengan nilai balik
    public String getInfo() {
        return nim + " - " + nama + " - " + jurusan;
    }
}