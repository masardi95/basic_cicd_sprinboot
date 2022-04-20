package com.example.demomongodb.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by,
 * MAS, Jumat, 25/03/2022
 * 15.01
 */


@Document(collection = "Buku")
public class BukuEntity {
    @Id
    private String id;
    private String namaBuku;
    private String deskripsi;

}
