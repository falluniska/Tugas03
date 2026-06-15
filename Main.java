/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.naufalhafiz03;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {

        // Object Constructor 1
        Mahasiswa mhs1 = new Mahasiswa();

        // Object Constructor 2
        Mahasiswa mhs2 = new Mahasiswa(101);

        // Object Constructor 3
        Mahasiswa mhs3 = new Mahasiswa(
                102,
                "Budi",
                "Informatika"
        );

        System.out.println("=== Constructor 1 ===");
        mhs1.setNim(100);
        mhs1.setNama("Andi");
        mhs1.setJurusan("Sistem Informasi");
        mhs1.tampilData();

        System.out.println();

        System.out.println("=== Constructor 2 ===");
        mhs2.setNama("Siti");
        mhs2.setJurusan("Teknik Informatika");
        System.out.println(mhs2.getInfo());

        System.out.println();

        System.out.println("=== Constructor 3 ===");
        mhs3.tampilData();

        System.out.println();

        MahasiswaDAO dao = new MahasiswaDAO();

        System.out.println("CREATE SQL:");
        System.out.println(dao.create(mhs3));

        System.out.println();

        System.out.println("READ SQL:");
        System.out.println(dao.read());

        System.out.println();

        System.out.println("UPDATE SQL:");
        mhs3.setNama("Budi Santoso");
        System.out.println(dao.update(mhs3));

        System.out.println();

        System.out.println("DELETE SQL:");
        System.out.println(dao.delete(102));
    }
}