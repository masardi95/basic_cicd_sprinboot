package com.example.demomongodb.service.siswa;

import com.example.demomongodb.entity.SiswaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by,
 * MAS, Sabtu, 12/03/2022
 * 08.03
 */

public interface SiswaService {
    Page<SiswaEntity> getSiswa(Pageable firstPageWithTwoElements);

    boolean simpanSiswa(SiswaEntity siswaEntity);

    void getByidSiswa(Integer idSiswa);
}
