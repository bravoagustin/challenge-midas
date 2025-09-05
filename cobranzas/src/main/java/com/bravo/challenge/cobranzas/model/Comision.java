package com.bravo.challenge.cobranzas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "comisiones")
public class Comision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuario;
    private String cartera;
    private String periodoObjetivo;
    private String licencia;
    private String tiempoProximaActualizacion;
    private String objetivoNivel1;
    private String comision;
    private String hitoMes;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getCartera() { return cartera; }
    public void setCartera(String cartera) { this.cartera = cartera; }

    public String getPeriodoObjetivo() { return periodoObjetivo; }
    public void setPeriodoObjetivo(String periodoObjetivo) { this.periodoObjetivo = periodoObjetivo; }

    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public String getTiempoProximaActualizacion() { return tiempoProximaActualizacion; }
    public void setTiempoProximaActualizacion(String tiempoProximaActualizacion) { this.tiempoProximaActualizacion = tiempoProximaActualizacion; }

    public String getObjetivoNivel1() { return objetivoNivel1; }
    public void setObjetivoNivel1(String objetivoNivel1) { this.objetivoNivel1 = objetivoNivel1; }

    public String getComision() { return comision; }
    public void setComision(String comision) { this.comision = comision; }

    public String getHitoMes() { return hitoMes; }
    public void setHitoMes(String hitoMes) { this.hitoMes = hitoMes; }
}