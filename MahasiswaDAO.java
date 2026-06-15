/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.naufalhafiz03;

/**
 *
 * @author User
 */
public class MahasiswaDAO {

    // CREATE
    public String create(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa(nim,nama,jurusan) VALUES("
                + mhs.getNim() + ",'"
                + mhs.getNama() + "','"
                + mhs.getJurusan() + "')";

        return sql;
    }

    // READ
    public String read() {
        String sql = "SELECT * FROM mahasiswa";
        return sql;
    }

    // UPDATE
    public String update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama='"
                + mhs.getNama()
                + "', jurusan='"
                + mhs.getJurusan()
                + "' WHERE nim="
                + mhs.getNim();

        return sql;
    }

    // DELETE
    public String delete(int nim) {
        String sql = "DELETE FROM mahasiswa WHERE nim=" + nim;
        return sql;
    }
}
