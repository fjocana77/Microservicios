package com.espe.micro.asignaturas.repositories;

import com.espe.micro.asignaturas.models.entities.Asignatura;
import org.springframework.data.repository.CrudRepository;

public interface AsignaturaRepository extends CrudRepository<Asignatura, Long> {
}