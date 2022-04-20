package com.example.demomongodb.repository;

import com.example.demomongodb.entity.SiswaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by,
 * MAS, Kamis, 10/03/2022
 * 19.39
 */

@Repository
public interface SiswaRepository extends PagingAndSortingRepository<SiswaEntity, String> {
    Optional<SiswaEntity> findByUsername(String username);

    List<SiswaEntity> findByUsernameLike(String ardi12ipa);

    Optional<SiswaEntity> findByIdSiswa(int idSiswa);

    Optional<SiswaEntity> findByIdSiswaOrUsername(int idSiswa, String username);

    void findByEmailSiswa(String s);
}
