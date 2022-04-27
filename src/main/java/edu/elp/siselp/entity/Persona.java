package edu.elp.siselp.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PERSONA")
@Inheritance( strategy = InheritanceType.JOINED)

public class Persona {
    @Id
    @GeneratedValue(  strategy =GenerationType.IDENTITY )
    private long idpersona;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 100, nullable = false)
    private String apellido;

    @Column(name = "edad", length = 10)
    private String edad;

    @Column(name = "sexo", length = 10)
    private String sexo;

    @Column(name = "dni", length = 10, nullable = false)
    private String dni;

    @Column(name = "direccion", length = 100)
    private String direccion;

    @Column(name = "telefono", length = 10)
    private String telefono;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;



    public Persona() {
    }

    public Persona(long idpersona) {
        this.idpersona = idpersona;
    }

    public Persona(long idpersona, String nombre, String apellido, String edad, String sexo, String dni, String direccion, String telefono, Date fechaNacimiento) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;


    }

    public long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(long idpersona) {
        this.idpersona = idpersona;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void
    setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "idpersona=" + idpersona +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad='" + edad + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento=" + fechaNacimiento;
    }
}
