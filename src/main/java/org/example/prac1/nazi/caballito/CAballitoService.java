package org.example.prac1.nazi.caballito;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CAballitoService {

    private final CaballitoRepo caballitoRepo;

    public CaballitoEntity getCaballitoById(Long id) {
        return caballitoRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("NO HAY CABALLO"));
    }

    public CaballitoEntity createCaballito(CaballitoEntity caballitoEntity) {
        return caballitoRepo.save(caballitoEntity);
    }
}
