package org.example.prac1.perro.application;

import lombok.RequiredArgsConstructor;
import org.example.prac1.perro.domain.Perro;
import org.example.prac1.perro.domain.PerroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/perros")
@RequiredArgsConstructor
public class PerroController {
    private final PerroService perroService;


    @GetMapping("/{id}")
    public ResponseEntity<Perro> getPerroById(@PathVariable Long id){
        Perro perro = perroService.getPerroById(id);
        return ResponseEntity.ok(perro);
    }

    @PostMapping()
    public ResponseEntity<Perro> createPerro(@RequestBody Perro perro){
        Perro createdPerro = perroService.createPerro(perro);
        return ResponseEntity.ok(createdPerro);
    }


}
