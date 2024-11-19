package es.ieslosmontecillos.AppAgendaBE.entity;

import jakarta.persistence.*;
import org.springframework.data.rest.core.AggregateReference;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "PERSONA")
public class Persona implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private long id;
    @Basic
    @Column(name = "NOMBRE", nullable = false, length = 20)
    private String nombre;
    @Basic
    @Column(name = "APELLIDOS", nullable = false, length = 40)
    private String apellidos;
    @Basic
    @Column(name = "TELEFONO", nullable = true, length = 15)
    private String telefono;
    @Basic
    @Column(name = "EMAIL", nullable = true, length = 30)
    private String email;
    @ManyToOne
    @JoinColumn(name = "PROVINCIA", referencedColumnName = "ID")
    private Provincia provincia;
    @Basic
    @Column(name = "FECHA", nullable = true)
    private Date fecha_nacimiento;
    @Basic
    @Column(name = "NUM_HIJOS", nullable = true)
    private short num_hijos;
    @Basic
    @Column(name = "ESTADO_CIVIL", nullable = true, length = 1)
    private char estado_civil;
    @Basic
    @Column(name = "SALARIO", nullable = true, precision = 9, scale = 2)
    private BigDecimal salario;
    @Basic
    @Column(name = "JUBILADO", nullable = true)
    private byte jubilado;
    @Basic
    @Column(name = "FOTO", nullable = true, length = 30)
    private String foto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public short getNum_hijos() {
        return num_hijos;
    }

    public void setNum_hijos(short num_hijos) {
        this.num_hijos = num_hijos;
    }

    public char getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(char estado_civil) {
        this.estado_civil = estado_civil;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public byte getJubilado() {
        return jubilado;
    }

    public void setJubilado(byte jubilado) {
        this.jubilado = jubilado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id && Objects.equals(nombre, persona.nombre) && Objects.equals(apellidos, persona.apellidos)
                && Objects.equals(telefono, persona.telefono) && Objects.equals(email, persona.email)
                && provincia == persona.provincia && fecha_nacimiento == persona.fecha_nacimiento
                && num_hijos == persona.num_hijos && estado_civil == persona.estado_civil
                && salario == persona.salario && jubilado == persona.jubilado && foto.equals(persona.foto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos, telefono, email, provincia,
                fecha_nacimiento, num_hijos, estado_civil, salario, jubilado, foto);
    }
}
