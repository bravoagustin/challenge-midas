package com.bravo.challenge.cobranzas.dtos;

public class MisComisionesDTO {
    private String nombre;
    private String apellido;
    private String fotoUrl;
    private String cartera;
    private String periodoObjetivo;
    private String periodoLicencia;
    private int porcentajeObjetivo;
    private double montoComision;
    private String hitoMes;
    private int minutosProximaActualizacion;

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

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getCartera() {
        return cartera;
    }

    public void setCartera(String cartera) {
        this.cartera = cartera;
    }

    public String getPeriodoObjetivo() {
        return periodoObjetivo;
    }

    public void setPeriodoObjetivo(String periodoObjetivo) {
        this.periodoObjetivo = periodoObjetivo;
    }

    public String getPeriodoLicencia() {
        return periodoLicencia;
    }

    public void setPeriodoLicencia(String periodoLicencia) {
        this.periodoLicencia = periodoLicencia;
    }

    public int getPorcentajeObjetivo() {
        return porcentajeObjetivo;
    }

    public void setPorcentajeObjetivo(int porcentajeObjetivo) {
        this.porcentajeObjetivo = porcentajeObjetivo;
    }

    public double getMontoComision() {
        return montoComision;
    }

    public void setMontoComision(double montoComision) {
        this.montoComision = montoComision;
    }

    public String getHitoMes() {
        return hitoMes;
    }

    public void setHitoMes(String hitoMes) {
        this.hitoMes = hitoMes;
    }

    public int getMinutosProximaActualizacion() {
        return minutosProximaActualizacion;
    }

    public void setMinutosProximaActualizacion(int minutosProximaActualizacion) {
        this.minutosProximaActualizacion = minutosProximaActualizacion;
    }
}
