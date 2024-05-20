package com.example.planviajes.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.planviajes.entity.Encuesta;
import com.example.planviajes.repository.EncuestaRepository;

@Service

public class EncuestaService {
    @Autowired
    EncuestaRepository encuestaRepository;

    public List<Encuesta> getEncuestas(){
        return encuestaRepository.findAll();
    }

    public Optional<Encuesta> getEncuesta(Long id){
        return encuestaRepository.findById(id);
    }

    public void saveOrUpdate(Encuesta encuesta){
        encuestaRepository.save(encuesta);
    }

    public void delete(Long id){
        encuestaRepository.deleteById(id);
    }



}


