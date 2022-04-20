package com.example.demomongodb.service.siswa;

import com.example.demomongodb.entity.SiswaEntity;
import com.example.demomongodb.repository.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by,
 * MAS, Sabtu, 12/03/2022
 * 08.03
 */

@Service
public class SiswaServiceImpl implements SiswaService {
    @Autowired
    private SiswaRepository siswaRepository;

    @Override
    public Page<SiswaEntity> getSiswa(Pageable pageable) {
        return siswaRepository.findAll(pageable);
    }

    @Override
    public boolean simpanSiswa(SiswaEntity siswaEntity) {
        if (!checkExistingIdSiswa(siswaEntity))
            siswaRepository.save(siswaEntity);
        else
            return false;

        return true;
    }

    @Override
    public void getByidSiswa(Integer idSiswa) {
        siswaRepository.findByIdSiswa(idSiswa);
        siswaRepository.findByEmailSiswa("ardi@gmail.com");
    }

    private boolean checkExistingIdSiswa(SiswaEntity siswaEntity) {
        Optional<SiswaEntity> check = siswaRepository.findByIdSiswaOrUsername(siswaEntity.getIdSiswa(), siswaEntity.getUsername());
        if (check.isPresent())
            return true;
        else return false;
    }
}
