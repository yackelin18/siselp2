package edu.elp.siselp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="administrativo")
@PrimaryKeyJoinColumn(referencedColumnName = "IDpersona")

public class Administrativo extends Persona{

    @Column(name="cod_administrativo", length = 12)
    private String codAdministrativo;

    @Column(name="area_labor", length = 12)
    private String area_Labor;

    public Administrativo() {
    }

    public String getCodAdministrativo() {
        return codAdministrativo;
    }

    public void setCodAdministrativo(String codAdministrativo) {
        this.codAdministrativo = codAdministrativo;
    }

    public String getArea_Labor() {
        return area_Labor;
    }

    public void setArea_Labor(String area_Labor) {
        this.area_Labor = area_Labor;
    }
}
