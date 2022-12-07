package com.springproyects.martaperez.instituto.Services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springproyects.martaperez.instituto.Model.Alumno;

public interface AlumnoService {

    public Page<Alumno> findAll(Pageable page);

    public Alumno findById(int codigo);

    public void insert(Alumno alumno);

    public void update(Alumno alumno);

    public void delete(int codigo);
}
