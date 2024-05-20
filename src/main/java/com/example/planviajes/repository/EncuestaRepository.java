package com.example.planviajes.repository;


import com.example.planviajes.entity.Encuesta;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta, Long>{


}
