package com.example.demomongodb.repository;

import com.example.demomongodb.entity.BukuEntity;
import com.example.demomongodb.entity.SiswaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by,
 * MAS, Jumat, 25/03/2022
 * 15.03
 */

@Repository
public interface BukuRepository extends MongoRepository<BukuEntity, String> {
}
