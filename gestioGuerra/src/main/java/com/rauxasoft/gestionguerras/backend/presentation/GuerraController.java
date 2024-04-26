package com.rauxasoft.gestionguerras.backend.presentation;

import com.rauxasoft.gestionguerras.backend.business.model.Guerra;
import com.rauxasoft.gestionguerras.backend.business.services.GuerraServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guerras")
public class GuerraController {

    @Autowired
    private GuerraServices guerraServices;

    @GetMapping("/")
    public ResponseEntity<List<Guerra>> getAllGuerras() {
        List<Guerra> guerras = guerraServices.getAllGuerras();
        return ResponseEntity.ok(guerras);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Guerra> getGuerraById(@PathVariable Long id) {
        Guerra guerra = guerraServices.getGuerraById(id);
        if (guerra != null) {
            return ResponseEntity.ok(guerra);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/")
    public ResponseEntity<Guerra> createGuerra(@RequestBody Guerra guerra) {
        Guerra newGuerra = guerraServices.saveGuerra(guerra);
        return ResponseEntity.ok(newGuerra);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Guerra> updateGuerra(@PathVariable Long id, @RequestBody Guerra guerra) {
        Guerra existingGuerra = guerraServices.getGuerraById(id);
        if (existingGuerra != null) {
            guerra.setId(id);
            guerraServices.updateGuerra(guerra);
            return ResponseEntity.ok(guerra);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuerra(@PathVariable Long id) {
        guerraServices.deleteGuerra(id);
        return ResponseEntity.ok().build();
    }
}
