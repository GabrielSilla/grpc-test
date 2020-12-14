package com.example.struct.etiqueta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(path = "/etiqueta", produces = {MediaType.APPLICATION_JSON_VALUE})
public class EtiquetaRest {

    @Autowired
    private EtiquetaService etiquetaService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        String value = etiquetaService.getEtiqueta();
        return ResponseEntity.ok().body(value);
    }
}
