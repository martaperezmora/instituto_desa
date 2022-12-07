package com.springproyects.martaperez.instituto.Model;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String dni;
    private String fechaNac;
    private String email;
    private boolean esNuevo;
    private int codigo;
    private byte[] imagen;

    public Alumno() {
    }

    public Alumno(int codigo) {
        this.codigo = codigo;
    }

    public Alumno(String nombre, String apellidos, String dni, String fechaNac, String email, boolean esNuevo,
            int codigo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.email = email;
        this.esNuevo = esNuevo;
        this.codigo = codigo;
    }
    
    public Alumno(String nombre, String apellidos, String dni, String fechaNac, String email, boolean esNuevo,
            int codigo, byte[] imagen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.email = email;
        this.esNuevo = esNuevo;
        this.codigo = codigo;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isEsNuevo() {
        return esNuevo;
    }
    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }
    
    public byte[] getImagen() {
        return imagen;
    }
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    public int getCodigo() {
        return codigo;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    public void setCodigo(int intValue) {
    }

    
}
