package caballito.nazi;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/caballitos")
@RequiredArgsConstructor
public class CaballoController {

    private final CAballitoService caballitoService;


    @GetMapping("/{id}")
    public ResponseEntity<CaballitoEntity> getCaballitoById(@PathVariable Long id) {
        CaballitoEntity caballito = caballitoService.getCaballitoById(id);
        return ResponseEntity.ok(caballito);
    }


    @PostMapping
    public ResponseEntity<CaballitoEntity> createCaballito(@RequestBody CaballitoEntity caballitoEntity) {
        CaballitoEntity nuevoCaballito = caballitoService.createCaballito(caballitoEntity);
        return ResponseEntity.ok(nuevoCaballito);
    }
}