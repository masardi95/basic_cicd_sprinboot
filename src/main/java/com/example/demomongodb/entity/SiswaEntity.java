package com.example.demomongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by,
 * MAS, Kamis, 10/03/2022
 * 19.25
 */

@Document(collection = "siswas")
public class SiswaEntity {
    @Id
    private String id;
    private int idSiswa;
    private int idKelas;
    private int idKelasParalel;
    private int idSekolah;
    private String username;
    private String emailSiswa;
    private String alamatSiswa;
    private String passwordSiswa;
    private String kodeTahunAjaran;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public int getIdKelasParalel() {
        return idKelasParalel;
    }

    public void setIdKelasParalel(int idKelasParalel) {
        this.idKelasParalel = idKelasParalel;
    }

    public int getIdSekolah() {
        return idSekolah;
    }

    public void setIdSekolah(int idSekolah) {
        this.idSekolah = idSekolah;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailSiswa() {
        return emailSiswa;
    }

    public void setEmailSiswa(String emailSiswa) {
        this.emailSiswa = emailSiswa;
    }

    public String getAlamatSiswa() {
        return alamatSiswa;
    }

    public void setAlamatSiswa(String alamatSiswa) {
        this.alamatSiswa = alamatSiswa;
    }

    public String getPasswordSiswa() {
        return passwordSiswa;
    }

    public void setPasswordSiswa(String passwordSiswa) {
        this.passwordSiswa = passwordSiswa;
    }

    public String getKodeTahunAjaran() {
        return kodeTahunAjaran;
    }

    public void setKodeTahunAjaran(String kodeTahunAjaran) {
        this.kodeTahunAjaran = kodeTahunAjaran;
    }
}
