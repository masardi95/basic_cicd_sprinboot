package com.example.demomongodb.entity;

/**
 * Created by,
 * MAS, Jumat, 18/03/2022
 * 20.38
 */

public class SiswaKelasDto {
    private int idSiswa;
    private int idKelas;
    private String username;
    private String namaKelas;

    public int getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(int idSiswa) {
        this.idSiswa = idSiswa;
    }

    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
}
