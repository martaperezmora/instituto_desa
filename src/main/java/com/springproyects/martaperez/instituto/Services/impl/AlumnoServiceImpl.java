package com.springproyects.martaperez.instituto.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springproyects.martaperez.instituto.Dao.AlumnoDAO;
import com.springproyects.martaperez.instituto.Model.Alumno;
import com.springproyects.martaperez.instituto.Services.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoDAO alumnoDAO;

    @Override
    public Page<Alumno> findAll(Pageable page) {
        return alumnoDAO.findAll(page);
    }

    @Override
    public Alumno findById(int codigo) {
        return alumnoDAO.findById(codigo);
    }

    @Override
    public void insert(Alumno Alumno) {
        alumnoDAO.insert(Alumno);
    }

    @Override
    public void update(Alumno alumno) {
        alumnoDAO.update(alumno);

        if (alumno.getImagen() != null && alumno.getImagen().length > 0) {
            alumnoDAO.updateImage(alumno);
        }
    }

    @Override
    public void delete(int codigo) {
        alumnoDAO.delete(codigo);
    }

}
