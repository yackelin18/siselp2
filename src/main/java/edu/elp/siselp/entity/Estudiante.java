package edu.elp.siselp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "IDpersona")

public class Estudiante extends Persona {

    @Id
    @GeneratedValue(  strategy =GenerationType.IDENTITY )
    private long idestudiante;


    @Column(name="codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name="serie", length = 8)
    private String serie;

    @Column(name="estado_egreso", length = 8)
    private String estadoEgreso; //Si es egresado: SI, NO

    public Estudiante() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getEstadoEgreso() {
        return estadoEgreso;
    }

    public void setEstadoEgreso(String estadoEgreso) {
        this.estadoEgreso = estadoEgreso;
    }

    public Estudiante(String codigo, String serie, String estadoEgreso) {
        this.codigo = codigo;
        this.serie = serie;
        this.estadoEgreso = estadoEgreso;
    }

    public Estudiante(long idpersona, String codigo, String serie, String estadoEgreso) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
        this.estadoEgreso = estadoEgreso;
    }

    public Estudiante(long idpersona, String nombre, String apellido, String edad, String sexo, String dni, String direccion, String telefono, Date fechaNacimiento, String codigo, String serie, String estadoEgreso) {
        super(idpersona, nombre, apellido, edad, sexo, dni, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.serie = serie;
        this.estadoEgreso = estadoEgreso;
    }

}
