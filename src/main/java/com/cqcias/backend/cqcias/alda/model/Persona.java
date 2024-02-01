package com.cqcias.backend.cqcias.alda.model;

import jakarta.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "personas")
// @Convert(converter = ZonedDateTime.class, attributeName = "fecha_ins")
// @Convert(converter = ZonedDateTime.class, attributeName = "fecha_upd")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "primer_apellido", length = 100, nullable = false)
    private String primer_apellido;

    @Column(name = "segundo_apellido", length = 100, nullable = false)
    private String segundo_apellido;

    @Column(name = "telefono", length = 10, nullable = false)
    private String telefono;

    @Column(name = "estatus", length = 1, nullable = false)
    private String estatus;

    @Column(name = "fecha_ins")
    private ZonedDateTime fecha_ins;

    @Column(name = "fecha_upd")
    private ZonedDateTime fecha_upd;

    @PreUpdate
    private void preUpdate(){
        fecha_upd = ZonedDateTime.now();
    }



    public Persona(){

    }

    public Persona(Long id_persona, String nombre, String primer_apellido, String segundo_apellido, String telefono, String estatus, ZonedDateTime fecha_ins, ZonedDateTime fecha_upd) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.telefono = telefono;
        this.estatus = estatus;
        this.fecha_ins = fecha_ins;
        this.fecha_upd = fecha_upd;
    }

    public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public ZonedDateTime getFecha_ins() {
        return fecha_ins;
    }

    public void setFecha_ins(ZonedDateTime fecha_ins) {
        this.fecha_ins = fecha_ins;
    }

    public ZonedDateTime getFecha_upd() {
        return fecha_upd;
    }

    public void setFecha_upd(ZonedDateTime fecha_upd) {
        this.fecha_upd = fecha_upd;
    }
}
