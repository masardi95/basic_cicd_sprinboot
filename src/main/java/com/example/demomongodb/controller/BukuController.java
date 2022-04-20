package com.example.demomongodb.controller;

import com.example.demomongodb.entity.BukuEntity;
import com.example.demomongodb.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by,
 * MAS, Jumat, 25/03/2022
 * 14.59
 */


@RestController
@RequestMapping(value = "api/v1/buku")
public class BukuController {

    @Autowired
    private BukuRepository bukuRepository;

    @PostMapping(name = "/")
    public void saveBuku(@RequestBody BukuEntity bukuEntity){
        bukuRepository.save(bukuEntity);
    }

    @GetMapping (name = "/")
    public Iterable<BukuEntity> fetchBuku(){
        Iterable<BukuEntity> list=  bukuRepository.findAll();
        return list;
    }
}
