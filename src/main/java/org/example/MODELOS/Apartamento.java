package org.example.MODELOS;

public class Apartamento {

    private String idApartamento;
    private String direccion;
    private Integer numeroHabitaciones;
    private Integer numeroBanos;
    private Double precioAlquiler;
    private String estado;
    private Boolean estacionamientoDisponible;

    public Apartamento() {
    }

    public Apartamento(String idApartamento, String direccion, Integer numeroHabitaciones, Integer numeroBanos, Double precioAlquiler, String estado, Boolean estacionamientoDisponible) {
        this.idApartamento = idApartamento;
        this.direccion = direccion;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
        this.precioAlquiler = precioAlquiler;
        this.estado = estado;
        this.estacionamientoDisponible = estacionamientoDisponible;
    }

    public String getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(String idApartamento) {
        this.idApartamento = idApartamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Integer getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(Integer numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public Double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(Double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean isEstacionamientoDisponible() {
        return estacionamientoDisponible;
    }

    public void setEstacionamientoDisponible(Boolean estacionamientoDisponible) {
        this.estacionamientoDisponible = estacionamientoDisponible;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "idApartamento='" + idApartamento + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", numeroBanos=" + numeroBanos +
                ", precioAlquiler=" + precioAlquiler +
                ", estado='" + estado + '\'' +
                ", estacionamientoDisponible=" + estacionamientoDisponible +
                '}';
    }
}
