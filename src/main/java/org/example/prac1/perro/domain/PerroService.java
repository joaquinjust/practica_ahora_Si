package org.example.prac1.perro.domain;

import lombok.RequiredArgsConstructor;
import org.example.prac1.perro.infrastructure.PerroRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PerroService {
    private final PerroRepository perroRepository;


    public Perro getPerroById(Long id) {
        Perro perro = perroRepository.findById(id).orElseThrow(() -> new RuntimeException("Perro not found"));
        return perro;
    }

    public Perro createPerro(Perro perro) {
        Perro savedPerro = perroRepository.save(perro);
        return savedPerro;
    }
}
