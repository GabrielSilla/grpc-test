package com.example.struct.etiqueta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtiquetaService {

    private String etiqueta = new String();

    @Autowired
    public EtiquetaService() {
        setEtiqueta("123456");
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String value) {
        this.etiqueta = value;
    }
}
