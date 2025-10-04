package org.example.prac1.perro.infrastructure;


import org.example.prac1.perro.domain.Perro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PerroRepository extends JpaRepository<Perro, Long> {

}
