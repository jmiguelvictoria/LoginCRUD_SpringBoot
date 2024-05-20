package com.example.planviajes.controller;

import java.util.List; // Import the correct List class
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.planviajes.entity.Encuesta;
import com.example.planviajes.service.EncuestaService;

@RestController
@RequestMapping(path = "/api/v1/encuestas")
public class EncuestaController {

    @Autowired
    private EncuestaService encuestaService; 

    @GetMapping
    public List<Encuesta> getAll(){

        return encuestaService.getEncuestas();
    }

    @GetMapping("/{encuestaId}")
    public Optional<Encuesta> getBId(@PathVariable Long encuestaId){

        return encuestaService.getEncuesta(encuestaId);
    }

    @PostMapping
    public Encuesta saveOrUpdate(@RequestBody Encuesta encuesta){

        encuestaService.saveOrUpdate(encuesta);
        return encuesta;
    }

    @DeleteMapping("/{encuestaId}")
    public void delete(@PathVariable Long encuestaId){

        encuestaService.delete(encuestaId);
    }

}
