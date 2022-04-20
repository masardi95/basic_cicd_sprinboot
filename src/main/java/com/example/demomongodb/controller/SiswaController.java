package com.example.demomongodb.controller;

import com.example.demomongodb.entity.KelasEntity;
import com.example.demomongodb.entity.SiswaEntity;
import com.example.demomongodb.entity.SiswaKelasDto;
import com.example.demomongodb.repository.SiswaRepository;
import com.example.demomongodb.service.siswa.SiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by,
 * MAS, Kamis, 10/03/2022
 * 19.24
 */

@RestController
@RequestMapping(value = "api/v1/siswa")
public class SiswaController {

    @Autowired
    private SiswaService siswaService;

    @PostMapping(value = "/")
    public String saveSiswa (@RequestBody SiswaEntity siswaEntity){

        if (siswaService.simpanSiswa(siswaEntity)){
            return "success";
        }else{
            return "false";
        }

    }

    @GetMapping(value = "/")
    public Page<SiswaEntity> getAll(){

        Pageable firstPageWithTwoElements = PageRequest.of(1, 10);
        Page<SiswaEntity> listSiswa = siswaService.getSiswa(firstPageWithTwoElements);

        KelasEntity kelasEntity = new KelasEntity();            // umpamanya ini adalah fetching ke collection
        SiswaEntity siswaEntity = new SiswaEntity();            // umpamanya ini adalah fetching ke collection

        SiswaKelasDto siswaKelasDto = new SiswaKelasDto();
        siswaKelasDto.setIdSiswa(siswaEntity.getIdSiswa());
        siswaKelasDto.setIdKelas(kelasEntity.getIdKelas());
        siswaKelasDto.setNamaKelas(kelasEntity.getNamaKelas());
        siswaKelasDto.setUsername(siswaEntity.getUsername());




        return listSiswa;
    }

    // baseUrl?id=9089
    @PutMapping(value = "/{idSiswa}")
    public String updateSiswa(@PathVariable Integer idSiswa){
        //eksekusi update data by id
        siswaService.getByidSiswa(idSiswa);
        return "";
    }

    @DeleteMapping(value = "/{id}")
    public String deleteSiswa(@PathVariable Integer id){
        //eksekusi delete data by id
        return "";
    }
}
