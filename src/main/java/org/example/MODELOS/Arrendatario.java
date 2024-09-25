package org.example.MODELOS;

import java.time.LocalDate;

public class Arrendatario {

    private String idArrendatario;
    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private String telefono;
    private String correoElectronico;
    private String direccion;

    public Arrendatario() {
    }

    public Arrendatario(String idArrendatario, String nombre, String apellido, String numeroIdentificacion, String telefono, String correoElectronico, String direccion) {
        this.idArrendatario = idArrendatario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    public String getIdArrendatario() {
        return idArrendatario;
    }

    public void setIdArrendatario(String idArrendatario) {
        this.idArrendatario = idArrendatario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
